/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.models.serviceImpl;

import com.fia.proyecto.models.dao.RolesDAO;
import com.fia.proyecto.models.entity.Roles;
import com.fia.proyecto.models.service.IService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JM Gutierrez
 */
@Service
public class RolesServiceImpl implements IService<Roles> {
    @Autowired
    private RolesDAO rolesDAO;

    public List<Roles> findAll() {
        return (List<Roles>) rolesDAO.findAll();
    }

    public Optional<Roles> findOne(Long id) {
        return rolesDAO.findById(id);
    }

    public Roles saveOrUpdate(Roles rol) {
        return rolesDAO.save(rol);
    }

    public void delete(Long id) {
        rolesDAO.deleteById(id);
    }

}
