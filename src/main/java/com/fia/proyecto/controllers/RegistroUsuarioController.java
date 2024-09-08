/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.controllers;

import com.fia.proyecto.models.entity.Usuarios;
import com.fia.proyecto.models.service.RolesService;
import com.fia.proyecto.models.service.UsuarioService;
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
@RequestMapping("registro")
public class RegistroUsuarioController {
    @Autowired
    private InicioSesionController iC;
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private RolesService rolSvc;    
    @ModelAttribute("usuario")
    public Usuarios retornarNuevoUsuario(Model modelo){
        modelo.addAttribute("listaDeRoles",rolSvc.findAll());
        return new Usuarios();
    }
    @PostMapping
    public String registrarCuentaDeUsuario(@ModelAttribute("usuario")Usuarios usuario,@RequestParam("imagen")MultipartFile imagen, Model model, HttpSession session)throws IOException{
        //usuario.setPerfil("imagen1.jpg");
        usuario.setPerfil(imagen.getOriginalFilename());
        String ruta=System.getProperty("user.dir")+"src/main/resources/static/img/usuarios/"+usuario.getPerfil();
        File directorioImagenes = new File(System.getProperty("user.dir")+"/src/main/resources/static/img/usuarios/"+usuario.getPerfil());
        imagen.transferTo(directorioImagenes);
        usuarioService.saveOrUpdate(usuario);
        System.out.println("USUARIO GUARDADO CORRECTAMENTE");
        return iC.iniciarSesion(usuario, model, session);
        //return"redirect:/registro?exito";
        //return "redirect:/inicioSesion";
    }
}
