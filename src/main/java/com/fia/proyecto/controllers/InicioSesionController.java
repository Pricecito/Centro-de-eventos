/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.controllers;

import com.fia.proyecto.models.entity.Roles;
import com.fia.proyecto.models.entity.Usuarios;
import com.fia.proyecto.models.service.RolesService;
import com.fia.proyecto.models.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author JM Gutierrez
 */
@Controller
@RequestMapping("inicioSesion")
public class InicioSesionController {
    @Autowired
    private UsuarioService uSvc;
    @Autowired
    private RolesService rolSvc;
    
    @GetMapping
    public String mostrarFormulario(Model model){
        model.addAttribute("listaDeRoles",rolSvc.findAll());
        model.addAttribute("usuario",new Usuarios());
        return "login";
    }
    @PostMapping
    public String iniciarSesion(@ModelAttribute("usuario")Usuarios usuario, Model model, HttpSession session){
        System.out.println("METODO EJECUTANDOSE");
        if(uSvc.buscarEmail(usuario)){
            System.out.println("VALIDANDO CUENTA");
            //model.addAttribute("usuarioIniciado",uSvc.buscarXEmail(usuario));
            session.setAttribute("usuarioIniciado", uSvc.buscarXEmail(usuario));
            System.out.println("CUENTA VALIDADA");
            return "redirect:/inicio";
        }else{
            model.addAttribute("error","Credenciales incorrectas");
            return "login";
        }
    }
}
