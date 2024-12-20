/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.models.serviceImpl;

import com.fia.proyecto.models.dao.Bolsa_de_trabajoDAO;
import com.fia.proyecto.models.entity.Bolsa_de_trabajo;
import com.fia.proyecto.models.service.IService;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Bolsa_de_trabajoServiceImpl implements IService<Bolsa_de_trabajo> {
    @Autowired
    private Bolsa_de_trabajoDAO bolsa_de_trabajoDAO;

    public List<Bolsa_de_trabajo> findAll() {
        return (List<Bolsa_de_trabajo>) bolsa_de_trabajoDAO.findAll();
    }

    public Optional<Bolsa_de_trabajo> findOne(Long id) {
        return bolsa_de_trabajoDAO.findById(id);
    }

    public Bolsa_de_trabajo saveOrUpdate(Bolsa_de_trabajo bolsa_de_trabajo) {
        return bolsa_de_trabajoDAO.save(bolsa_de_trabajo);
    }

    public void delete(Long id) {
        bolsa_de_trabajoDAO.deleteById(id);
    }

}
