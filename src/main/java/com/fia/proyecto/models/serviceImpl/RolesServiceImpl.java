/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.models.serviceImpl;

import com.fia.proyecto.models.dao.RolesDAO;
import com.fia.proyecto.models.entity.Roles;
import com.fia.proyecto.models.service.RolesService;
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
public class RolesServiceImpl implements RolesService{
    @Autowired
    private RolesDAO rolesDAO;
    @Transactional
    public List<Roles> findAll() {
        return (List<Roles>)rolesDAO.findAll();
    }

    @Transactional
    public Optional<Roles> findOne(Long id) {
        return rolesDAO.findById(id);
    }

    @Transactional
    public Roles saveOrUpdate(Roles rol) {
        return rolesDAO.save(rol);
    }

    @Transactional
    public void delete(Long id) {
        rolesDAO.deleteById(id);
    }
    
}
