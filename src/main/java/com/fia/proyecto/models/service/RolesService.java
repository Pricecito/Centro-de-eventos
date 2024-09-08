/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fia.proyecto.models.service;

import com.fia.proyecto.models.entity.Noticias;
import com.fia.proyecto.models.entity.Roles;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author JM Gutierrez
 */

public interface RolesService {
    List<Roles> findAll();
    Optional<Roles> findOne(Long id);
    Roles saveOrUpdate(Roles roles);
    void delete(Long id);
}
