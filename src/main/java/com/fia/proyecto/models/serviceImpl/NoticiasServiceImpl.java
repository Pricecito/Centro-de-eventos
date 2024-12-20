/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.models.serviceImpl;

import com.fia.proyecto.models.dao.NoticiasDAO;
import com.fia.proyecto.models.entity.Noticias;
import com.fia.proyecto.models.service.IService;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticiasServiceImpl implements IService<Noticias> {
    @Autowired
    private NoticiasDAO noticiasDAO;

    public List<Noticias> findAll() {
        return (List<Noticias>) noticiasDAO.findAll();
    }

    public Optional<Noticias> findOne(Long id) {
        return noticiasDAO.findById(id);
    }

    public Noticias saveOrUpdate(Noticias noticias) {
        return noticiasDAO.save(noticias);
    }

    public void delete(Long id) {
        noticiasDAO.deleteById(id);
    }
}
