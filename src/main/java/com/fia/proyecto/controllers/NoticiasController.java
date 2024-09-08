/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.controllers;

import com.fia.proyecto.models.entity.Eventos;
import com.fia.proyecto.models.entity.Noticias;
import com.fia.proyecto.models.entity.Usuarios;
import com.fia.proyecto.models.service.EventosService;
import com.fia.proyecto.models.service.NoticiasService;
import jakarta.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
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
@RequestMapping("noticia")
public class NoticiasController {
    @Autowired
    private NoticiasService nSvc;
    
    @GetMapping
    public String verNoticias(Model modelo){
        modelo.addAttribute("noticia",new Noticias());
        return "crearNoticia";
    }
    
    @GetMapping("verNoticia")
    public String crearEvento(Model modelo){
        modelo.addAttribute("listaNoticias",nSvc.findAll());
        modelo.addAttribute("noticia",new Noticias());
        return "blog";
    }
    @PostMapping
    public String guardarNoticia(@ModelAttribute("noticia")Noticias noticia, @RequestParam("imagen")MultipartFile imagen, HttpSession session, Model modelo)throws IOException{
        noticia.setImg(imagen.getOriginalFilename());
        File directorioImagenes = new File(System.getProperty("user.dir")+"/src/main/resources/static/img/noticias/"+noticia.getImg());
        imagen.transferTo(directorioImagenes);
        noticia.setUsuario((Usuarios)session.getAttribute("usuarioIniciado"));
        nSvc.saveOrUpdate(noticia);
        return "redirect:/noticia";
    }
}
