/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fia.proyecto.models.service;

import com.fia.proyecto.models.entity.Curso;
import java.util.List;
import java.util.Optional;


/**
 *
 * @author JM Gutierrez
 */
public interface CursoService {
    List<Curso> findAll();
    Optional<Curso>findOne(Long id);
    Curso saveOrUpdate(Curso curso);
    void delete(Long id);
}
