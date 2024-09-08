/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fia.proyecto.models.service;

import com.fia.proyecto.models.entity.Bolsa_de_trabajo;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author JM Gutierrez
 */
public interface Bolsa_de_trabajoService {
    List<Bolsa_de_trabajo> findAll();
    Optional<Bolsa_de_trabajo>findOne(Long id);
    Bolsa_de_trabajo saveOrUpdate(Bolsa_de_trabajo bolsa_de_trabajo);
    void delete(Long id);
}
