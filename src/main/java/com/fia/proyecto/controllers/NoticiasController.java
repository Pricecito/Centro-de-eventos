/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fia.proyecto.models.entity.Noticias;
import com.fia.proyecto.models.entity.Usuarios;
import com.fia.proyecto.models.service.IService;

import jakarta.servlet.http.HttpSession;

/**
 *
 * @author JM Gutierrez
 */
@Controller
@RequestMapping("noticia")
public class NoticiasController {
    @Autowired
    private IService<Noticias> nSvc;

    @GetMapping
    public String verNoticias(Model modelo) {
        modelo.addAttribute("noticia", new Noticias());
        modelo.addAttribute("noticias", nSvc.findAll());
        return "crearNoticia";
    }

    @PostMapping
    public String guardarNoticia(Noticias noticia, HttpSession session,
            Model modelo) throws IOException {
        Usuarios usuario = (Usuarios) session.getAttribute("usuario");
        noticia.setUsuario(usuario);
        nSvc.saveOrUpdate(noticia);

        /*
         * noticia.setImg(imagen.getOriginalFilename());
         * File directorioImagenes = new File(System.getProperty("user.dir")+
         * "/src/main/resources/static/img/noticias/"+noticia.getImg());
         * imagen.transferTo(directorioImagenes);
         * noticia.setUsuario((Usuarios)session.getAttribute("usuarioIniciado"));
         * nSvc.saveOrUpdate(noticia);
         */
        return "redirect:/noticia";
    }

    @GetMapping("edit/{id}")
    public String verNoticias(Model modelo, @PathVariable Long id) {

        return "crearNoticia";
    }

}
