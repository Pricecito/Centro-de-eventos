/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.models.serviceImpl;

import com.fia.proyecto.models.dao.AdministradorDAO;
import com.fia.proyecto.models.entity.Administrador;
import com.fia.proyecto.models.service.IService;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Lazy
@Slf4j
public class AdministradorServiceImpl implements IService<Administrador> {
    @Autowired
    private AdministradorDAO administradorDao;

    public List<Administrador> findAll() {
        return (List<Administrador>) administradorDao.findAll();
    }

    public Optional<Administrador> findOne(Long id) {
        return administradorDao.findById(id);
    }

    public Administrador saveOrUpdate(Administrador administrador) {
        return administradorDao.save(administrador);
    }

    public void delete(Long id) {
        administradorDao.deleteById(id);
    }

}
