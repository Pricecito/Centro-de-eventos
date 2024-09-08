/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.models.serviceImpl;

import com.fia.proyecto.models.dao.NoticiasDAO;
import com.fia.proyecto.models.entity.Noticias;
import com.fia.proyecto.models.service.NoticiasService;
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
public class NoticiasServiceImpl implements NoticiasService{
    @Autowired 
    private NoticiasDAO noticiasDAO;

    @Transactional(readOnly=true)
    public List<Noticias> findAll() {
        return (List<Noticias>)noticiasDAO.findAll();
    }

    @Transactional(readOnly=true)
    public Optional<Noticias> findOne(Long id) {
        return noticiasDAO.findById(id);
    }

    @Transactional
    public Noticias saveOrUpdate(Noticias noticias) {
        return noticiasDAO.save(noticias);
    }

    @Transactional
    public void delete(Long id) {
        noticiasDAO.deleteById(id);
    }
}
