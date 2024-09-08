/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fia.proyecto.models.service;

import com.fia.proyecto.models.entity.Usuarios;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author JM Gutierrez
 */
public interface UsuarioService {
    List<Usuarios> findAll();
    Optional<Usuarios>findOne(Long id);
    Usuarios saveOrUpdate(Usuarios usuario);
    void delete(Long id);
    boolean buscarEmail(Usuarios usuario);
    Usuarios buscarXEmail(Usuarios usuario);
    boolean buscarDNI(Usuarios usuario);
    boolean repeticionDNI(Usuarios usuario);
    boolean verificarPassword(Usuarios usuario);
    Usuarios buscarXDNI(Usuarios usuario);
}
