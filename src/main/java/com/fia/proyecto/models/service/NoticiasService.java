/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fia.proyecto.models.service;

import com.fia.proyecto.models.entity.Noticias;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author JM Gutierrez
 */
public interface NoticiasService {
    List<Noticias> findAll();
    Optional<Noticias> findOne(Long id);
    Noticias saveOrUpdate(Noticias noticias);
    void delete(Long id);
}
