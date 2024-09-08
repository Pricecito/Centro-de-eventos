/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.controllers;

import com.fia.proyecto.models.entity.Curso;
import com.fia.proyecto.models.entity.Eventos;
import com.fia.proyecto.models.service.CursoService;
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
@RequestMapping("curso")
public class CursoController {
    @Autowired
    private CursoService cSvc;
    
    @GetMapping
    public String mostrarCursos(){
        return "cursos";
    }
}
