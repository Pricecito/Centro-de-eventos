/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fia.proyecto.models.service;

import com.fia.proyecto.models.entity.Eventos;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author JM Gutierrez
 */
public interface EventosService {
    List<Eventos> findAll();
    Optional<Eventos> findOne(Long id);
    Eventos saveOrUpdate(Eventos eventos);
    void delete(Long id);
}
