/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.controllers;

import com.fia.proyecto.models.entity.Eventos;
import com.fia.proyecto.models.entity.Usuarios;
import com.fia.proyecto.models.service.EventosService;
import jakarta.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author JM Gutierrez
 */
@Controller
@RequestMapping("evento")
public class EventosController {
    @Autowired
    private EventosService eveSvc;
    
    @GetMapping
    public String verEventos(Model modelo){
        modelo.addAttribute("evento",new Eventos());
        modelo.addAttribute("listaEventos",eveSvc.findAll());
        return "eventos";
    }
    
    
    @PostMapping
    public String guardarEvento(@ModelAttribute("evento")Eventos evento,@RequestParam("imagen")MultipartFile imagen, HttpSession session, Model modelo)throws IOException{
        System.out.println("EJECUTANDO METODO CORRECTAMENTE");
        evento.setImg(imagen.getOriginalFilename());
        File directorioImagenes = new File(System.getProperty("user.dir")+"/src/main/resources/static/img/eventos/"+evento.getImg());
        imagen.transferTo(directorioImagenes);
        System.out.println("GUARDADNO IMAGEN");
        evento.setUsuario((Usuarios)session.getAttribute("usuarioIniciado"));
        modelo.addAttribute("usuario",(Usuarios)session.getAttribute("usuarioIniciado"));
        eveSvc.saveOrUpdate(evento);
        System.out.println("EVENTOS GUARDADO CORRECTAMENTE");
        return "redirect:/evento";
    }
    @GetMapping("eliminar/{id}")
    public String eliminarEvento(@PathVariable("id")long id,Model modelo){
        eveSvc.delete(id);
        return "redirect:/evento";
    }
}
