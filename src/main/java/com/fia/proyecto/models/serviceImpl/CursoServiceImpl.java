/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.models.serviceImpl;

import com.fia.proyecto.models.dao.CursoDAO;
import com.fia.proyecto.models.entity.Curso;
import com.fia.proyecto.models.service.CursoService;
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
public class CursoServiceImpl implements CursoService{
    @Autowired
    private CursoDAO cursoDAO;
    
    @Transactional(readOnly = true)
    public List<Curso> findAll() {
        return (List<Curso>)cursoDAO.findAll();
    }
    
    @Transactional(readOnly = true)
    public Optional<Curso> findOne(Long id){
        return cursoDAO.findById(id);
        
    }
    
    @Transactional
    public Curso saveOrUpdate(Curso curso) {
        return cursoDAO.save(curso);
    }
    
    @Transactional
    public void delete(Long id) {
        cursoDAO.deleteById(id);
    }
}
