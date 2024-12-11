/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fia.proyecto.models.entity.Usuarios;
import com.fia.proyecto.models.service.RolesService;
import com.fia.proyecto.models.service.UsuarioService;

import jakarta.servlet.http.HttpSession;

/**
 *
 * @author JM Gutierrez
 */

@Controller
@RequestMapping("registro")
public class RegistroUsuarioController {
    @Autowired
    private InicioSesionController iC;
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private RolesService rolSvc;

    @ModelAttribute("usuario")
    public Usuarios retornarNuevoUsuario(Model modelo) {
        modelo.addAttribute("listaDeRoles", rolSvc.findAll());
        return new Usuarios();
    }

    @PostMapping
    public String create(Usuarios usuario, Model model, HttpSession session) {

        usuarioService.saveOrUpdate(usuario);
        session.setAttribute("userSesion", usuario);
        model.addAttribute("usuarioIniciado", usuario);
        return "redirect:/inicio";

        /*
         * LOGICA DE GUARDADO DE IMAGENES
         * // usuario.setPerfil("imagen1.jpg");
         * usuario.setPerfil(imagen.getOriginalFilename());
         * String ruta = System.getProperty("user.dir") +
         * "src/main/resources/static/img/usuarios/" + usuario.getPerfil();
         * File directorioImagenes = new File(
         * System.getProperty("user.dir") + "/src/main/resources/static/img/usuarios/" +
         * usuario.getPerfil());
         * imagen.transferTo(directorioImagenes);
         * usuarioService.saveOrUpdate(usuario);
         * System.out.println("USUARIO GUARDADO CORRECTAMENTE");
         * return iC.iniciarSesion(usuario, model, session);
         * // return"redirect:/registro?exito";
         * // return "redirect:/inicioSesion";
         */

    }
}
