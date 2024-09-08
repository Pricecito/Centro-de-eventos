/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.controllers;

import com.fia.proyecto.models.entity.Directorio;
import com.fia.proyecto.models.entity.Eventos;
import com.fia.proyecto.models.service.DirectorioService;
import com.fia.proyecto.models.service.EventosService;
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
@RequestMapping("directorio")
public class DirectorioController {
    @Autowired
    private DirectorioService dSvc;
    
    @GetMapping
    public String verDirectorio(Model modelo){
        modelo.addAttribute("listaEventos",dSvc.findAll());
        return "verEventos";
    }
    
    @GetMapping("crearEvento")
    public String crearEvento(Model modelo){
        modelo.addAttribute("evento",new Eventos());
        return "crearEvento";
    }
    @PostMapping
    public String guardarContacto(@ModelAttribute("evento")Directorio directorio, Model modelo){
        dSvc.saveOrUpdate(directorio);
        return "redirect:/evento";
    }
}

