/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.models.serviceImpl;

import com.fia.proyecto.models.dao.CursoDAO;
import com.fia.proyecto.models.entity.Curso;
import com.fia.proyecto.models.service.IService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoServiceImpl implements IService<Curso> {
    @Autowired
    private CursoDAO cursoDAO;

    public List<Curso> findAll() {
        return (List<Curso>) cursoDAO.findAll();
    }

    public Optional<Curso> findOne(Long id) {
        return cursoDAO.findById(id);

    }

    public Curso saveOrUpdate(Curso curso) {
        return cursoDAO.save(curso);
    }

    public void delete(Long id) {
        cursoDAO.deleteById(id);
    }
}
