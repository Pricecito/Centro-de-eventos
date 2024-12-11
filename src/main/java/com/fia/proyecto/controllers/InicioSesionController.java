
package com.fia.proyecto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fia.proyecto.models.entity.Usuarios;
import com.fia.proyecto.models.service.UsuarioService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("inicioSesion")
public class InicioSesionController {
    @Autowired
    private UsuarioService uSvc;

    @GetMapping
    public String mostrarFormulario(Model model) {
        model.addAttribute("usuario", new Usuarios());
        return "login";
    }

    @PostMapping
    public String iniciarSesion(Usuarios usuario, Model model, HttpSession session) {
        Usuarios u = uSvc.buscarXEmail(usuario);
        if (uSvc.buscarEmail(usuario) && usuario.getPassword().equals(u.getPassword())) {
            session.setAttribute("userSesion", uSvc.buscarXEmail(usuario));
            model.addAttribute("usuarioIniciado", usuario);
            return "redirect:/inicio";
        } else {
            model.addAttribute("error", "Usuario o contraseña incorrectos");
            return "redirect:/inicioSesion";
        }
    }
}
