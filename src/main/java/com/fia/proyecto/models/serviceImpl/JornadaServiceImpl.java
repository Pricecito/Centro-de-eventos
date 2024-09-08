 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.models.serviceImpl;

import com.fia.proyecto.models.dao.JornadaDAO;
import com.fia.proyecto.models.entity.Jornada;
import com.fia.proyecto.models.service.JornadaService;
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
public class JornadaServiceImpl implements JornadaService{
    @Autowired private JornadaDAO jornadaDao;
    @Transactional
    public List<Jornada> findAll() {
        return (List<Jornada>)jornadaDao.findAll();
    }

    @Transactional
    public Optional<Jornada> findOne(Long id) {
        return jornadaDao.findById(id);
    }

    @Transactional
    public Jornada saveOrUpdate(Jornada jornada) {
        return jornadaDao.save(jornada);
    }

    @Transactional
    public void delete(Long id) {
        jornadaDao.deleteById(id);
    }
    
}
