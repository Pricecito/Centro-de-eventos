/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.controllers;

import com.fia.proyecto.models.entity.Bolsa_de_trabajo;
import com.fia.proyecto.models.entity.Eventos;
import com.fia.proyecto.models.entity.Noticias;
import com.fia.proyecto.models.entity.Usuarios;
import com.fia.proyecto.models.service.Bolsa_de_trabajoService;
import com.fia.proyecto.models.service.CursoService;
import com.fia.proyecto.models.service.DirectorioService;
import com.fia.proyecto.models.service.EventosService;
import com.fia.proyecto.models.service.NoticiasService;
import com.fia.proyecto.models.service.RolesService;
import com.fia.proyecto.models.service.UsuarioService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alumno104
 */
@Controller 
@RequestMapping("usmp")
public class USMPController {
    @Autowired
    private RolesService rolSvc;
    @Autowired
    private UsuarioService usuSvc;
    @Autowired
    private NoticiasService nSvc;
    @Autowired
    private CursoService cSvc;
    @Autowired
    private EventosService eveSvc;
    @Autowired
    private DirectorioService dirSvc;
    @Autowired
    private Bolsa_de_trabajoService bdtSvc;
    
    
    
    //NOTICIAS CRUD---------------------------------------------------------
    @GetMapping("verNoticias")
    public String verNoticias(Model modelo){
        modelo.addAttribute("listaNoticias",nSvc.findAll());
        return "verNoticias";
    }
    @GetMapping("crearNoticias")
    public String crearNoticia(Model modelo){
        modelo.addAttribute("listaUsuario",usuSvc.findAll());
        modelo.addAttribute("noticia",new Noticias());
        return "crearNoticia";
    }
    /*@PostMapping("guardarNoticias")
    public String guardarNoticia(@ModelAttribute("noticia")Noticias n){
        nSvc.saveOrUpdate(n);
        return "redirect:/verNoticias";
    }
    @GetMapping("modificarNoticias/{id}")
    public String actualizaNoticia(@PathVariable("id") long id,Model modelo){
        Noticias n= nSvc.findOne(id).get();
        modelo.addAttribute("listaUsuario",usuSvc.findAll());
        modelo.addAttribute("noticia",n);
        return "crearNoticia";
    }
    @GetMapping("eliminarNoticias/{id}")
    public String eliminarNoticia(@PathVariable("id")long id){
        nSvc.delete(id);
        return "redirect:/verNoticias";
    }
    
    //EVENTOS CRUD---------------------------------------------------------
    @GetMapping("verEventos")
    public String verEventos(Model modelo){
        modelo.addAttribute("listaEventos",eveSvc.findAll());
        return "verEventos";
    }
    
    @GetMapping("crearEvento")
    public String crearEvento(Model modelo){
        modelo.addAttribute("evento",new Eventos());
        return "crearEvento";
    }
    @PostMapping("guardarEvento")
    public String guardarEvento(Eventos e){
        eveSvc.saveOrUpdate(e);
        return "redirect:/verEventos";
    }
    @GetMapping("modificarEveto/{id}")
    public String modificarEventos (@PathVariable("id") long id,Model modelo){
        Eventos e= eveSvc.findOne(id).get();
        modelo.addAttribute("evento",new Eventos());
        return "crearEvento";
    }
    @GetMapping("eliminarEvento/{id}")
    public String eliminarEvento(@PathVariable("id")long id){
        eveSvc.delete(id);
        return "redirect:/verEventos";
    }
    
    
    public static Usuarios USUARIOiniciado;
    
    //Inicio de Sesion-------------------------------------------------------
    @GetMapping("inicioSesion")
    public String inicioSsesion(HttpServletRequest request, String nombreUsuario, Model model){
        if ("usuario".equals(nombreUsuario)) {
            // Crear un objeto Usuario y guardarlo en la sesión
            Usuarios usuario = new Usuarios();
            usuario.setNombres(nombreUsuario);
            request.getSession().setAttribute("usuario", usuario);

            return "redirect:/inicio";
        } else {
            // Si las credenciales no son válidas, mostrar mensaje de error
            model.addAttribute("error", "Credenciales incorrectas");
            return "login";
        }
    }
    @PostMapping("procesarDatos")
    public String procesarDatos(@ModelAttribute("usuario")Usuarios usuario){
        for(Usuarios u:usuSvc.findAll()){
            if(usuario.equals(u)){
                return "inicio";
            }
        }
        return "errorInicioDeSesion";
    }
    
    //Registro de usuario----------------------------------------------------
    @GetMapping("crearUsuario")
    public String crearUsuario(Model modelo){
        modelo.addAttribute("listaRoles",rolSvc.findAll());
        modelo.addAttribute("usuario",new Usuarios());
        return "registro";
    }
    @PostMapping("procesarUsuario")
    public String guardarUsuario(@ModelAttribute("usuario")Usuarios usuario){
        for(Usuarios u:usuSvc.findAll()){
            if(usuario.getCorreo().equals(u.getCorreo())){
                return "redirec";
            }
        }
        usuSvc.saveOrUpdate(usuario);
        
        return "redirect:/inicioSesion";
    }
    */
}
