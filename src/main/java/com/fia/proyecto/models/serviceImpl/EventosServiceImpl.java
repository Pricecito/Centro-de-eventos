/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.models.serviceImpl;

import com.fia.proyecto.models.dao.EventosDAO;
import com.fia.proyecto.models.entity.Eventos;
import com.fia.proyecto.models.service.EventosService;
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
public class EventosServiceImpl implements EventosService{
    @Autowired 
    private EventosDAO eventosDAO;

    @Transactional(readOnly=true)
    public List<Eventos> findAll() {
        return (List<Eventos>)eventosDAO.findAll();
    }
    
    @Transactional(readOnly=true)
    public Optional<Eventos> findOne(Long id) {
        return eventosDAO.findById(id);
    }
      
    @Transactional
    public Eventos saveOrUpdate(Eventos eventos) {
        return eventosDAO.save(eventos);
    }

    @Transactional
    public void delete(Long id) {
        eventosDAO.deleteById(id);
    }

    
}
