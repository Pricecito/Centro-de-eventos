/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fia.proyecto.models.service;

import com.fia.proyecto.models.entity.Administrador;
import com.fia.proyecto.models.entity.Bolsa_de_trabajo;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author JM Gutierrez
 */
public interface AdministradorService  {
    List<Administrador> findAll();
    Optional<Administrador>findOne(Long id);
    Administrador saveOrUpdate(Administrador administrador);
    void delete(Long id);
}
