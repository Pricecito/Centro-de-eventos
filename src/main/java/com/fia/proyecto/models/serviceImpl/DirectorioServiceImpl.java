/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.models.serviceImpl;

import com.fia.proyecto.models.dao.DirectorioDAO;
import com.fia.proyecto.models.entity.Directorio;
import com.fia.proyecto.models.service.IService;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DirectorioServiceImpl implements IService<Directorio> {
    @Autowired
    private DirectorioDAO directorioDAO;

    public List<Directorio> findAll() {
        return (List<Directorio>) directorioDAO.findAll();
    }

    public Optional<Directorio> findOne(Long id) {
        return directorioDAO.findById(id);
    }

    public Directorio saveOrUpdate(Directorio directorio) {
        return directorioDAO.save(directorio);
    }

    public void delete(Long id) {
        directorioDAO.deleteById(id);
    }
}
