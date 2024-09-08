/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fia.proyecto.models.service;

import com.fia.proyecto.models.dao.ContratoDAO;
import com.fia.proyecto.models.entity.Bolsa_de_trabajo;
import com.fia.proyecto.models.entity.Contrato;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author JM Gutierrez
 */
public interface ContratoService{
    List<Contrato> findAll();
    Optional<Contrato>findOne(Long id);
    Contrato saveOrUpdate(Contrato contrato);
    void delete(Long id);
}
