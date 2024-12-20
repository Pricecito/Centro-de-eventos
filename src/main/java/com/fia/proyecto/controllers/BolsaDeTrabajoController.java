/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.controllers;

import com.fia.proyecto.models.entity.Bolsa_de_trabajo;
import com.fia.proyecto.models.entity.Eventos;
import com.fia.proyecto.models.service.Bolsa_de_trabajoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("bolsaDeTrabajo")
public class BolsaDeTrabajoController {

    @Autowired
    private Bolsa_de_trabajoService bdtSvc;

    @GetMapping
    public String verEventos(Model modelo) {

        return "verBolsa_de_trabajo";
    }

    @GetMapping("crearEvento")
    public String crearEvento(Model modelo) {
        modelo.addAttribute("bdt", new Eventos());
        return "eventos";
    }

    @PostMapping
    public String guardarEvento(@ModelAttribute("bdt") Bolsa_de_trabajo bdt, Model modelo) {
        bdtSvc.saveOrUpdate(bdt);
        return "redirect:/evento";
    }
}
