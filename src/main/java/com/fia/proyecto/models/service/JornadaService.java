/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fia.proyecto.models.service;

import com.fia.proyecto.models.entity.Contrato;
import com.fia.proyecto.models.entity.Jornada;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author JM Gutierrez
 */
public interface JornadaService {
    List<Jornada> findAll();
    Optional<Jornada>findOne(Long id);
    Jornada saveOrUpdate(Jornada jornada);
    void delete(Long id);
}
