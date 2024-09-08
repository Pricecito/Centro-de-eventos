/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.controllers;

import com.fia.proyecto.models.entity.Usuarios;
import com.fia.proyecto.models.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author JM Gutierrez
 */
@Controller
@RequestMapping("perfil")
public class PerfilController {
    @Autowired 
    private UsuarioService uSvc;
    
    @ModelAttribute("usuarioIniciado")
    public Usuarios mostrarPerfil(Model modelo, HttpSession session){
        Usuarios usuarioIniciado=(Usuarios)session.getAttribute("usuarioIniciado");
        return usuarioIniciado;
    }
    @GetMapping
    public String mostrarDetalles(){
        return "perfil";
    }   
    
    
}
