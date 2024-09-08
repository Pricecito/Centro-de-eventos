/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fia.proyecto.models.service;

import com.fia.proyecto.models.entity.Directorio;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author JM Gutierrez
 */
public interface DirectorioService {
    List<Directorio> findAll();
    Optional<Directorio>findOne(Long id);
    Directorio saveOrUpdate(Directorio directorio);
    void delete(Long id);
}