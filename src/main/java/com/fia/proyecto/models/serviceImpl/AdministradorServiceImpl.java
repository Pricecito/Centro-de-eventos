/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.models.serviceImpl;

import com.fia.proyecto.models.dao.AdministradorDAO;
import com.fia.proyecto.models.entity.Administrador;
import com.fia.proyecto.models.service.AdministradorService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author JM Gutierrez
 */
@Service
public class AdministradorServiceImpl implements AdministradorService {
    @Autowired
    private AdministradorDAO administradorDao;
    @Transactional
    public List<Administrador> findAll() {
       return (List<Administrador>)administradorDao.findAll();
    }

    @Transactional
    public Optional<Administrador> findOne(Long id) {
        return administradorDao.findById(id);
    }

    @Transactional
    public Administrador saveOrUpdate(Administrador administrador) {
        return administradorDao.save(administrador);
    }

    @Transactional
    public void delete(Long id) {
        administradorDao.deleteById(id);
    }
    
}
