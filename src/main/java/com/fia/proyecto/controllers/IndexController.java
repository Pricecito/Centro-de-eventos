/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fia.proyecto.models.entity.Usuarios;
import com.fia.proyecto.models.service.UsuarioService;

import jakarta.servlet.http.HttpSession;

/**
 *
 * @author JM Gutierrez
 */
@Controller
@RequestMapping("inicio")
public class IndexController {
    @Autowired
    private UsuarioService uSvc;

    @GetMapping
    public String index(Model modelo, HttpSession session) {
        Usuarios usuarioIniciado = (Usuarios) session.getAttribute("userSesion");
        modelo.addAttribute("usuarioIniciado", usuarioIniciado);
        return "inicio";
    }

}
