/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.models.serviceImpl;

import com.fia.proyecto.models.dao.DirectorioDAO;
import com.fia.proyecto.models.entity.Directorio;
import com.fia.proyecto.models.service.DirectorioService;
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
public class DirectorioServiceImpl implements DirectorioService{
    @Autowired
    private DirectorioDAO directorioDAO;
    @Transactional(readOnly=true)
    public List<Directorio> findAll() {
        return (List<Directorio>)directorioDAO.findAll();
    }
    @Transactional(readOnly=true)
    public Optional<Directorio> findOne(Long id) {
        return directorioDAO.findById(id);
    }
    @Transactional
    public Directorio saveOrUpdate(Directorio directorio) {
        return directorioDAO.save(directorio);
    }
    @Transactional
    public void delete(Long id) {
        directorioDAO.deleteById(id);
    }
}
