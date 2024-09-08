/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.models.serviceImpl;

import com.fia.proyecto.models.dao.ContratoDAO;
import com.fia.proyecto.models.entity.Contrato;
import com.fia.proyecto.models.service.ContratoService;
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
public class ContratoServiceImpl implements ContratoService {
    @Autowired
    private ContratoDAO contratoDao;
    @Transactional
    public List<Contrato> findAll() {
        return (List<Contrato>)contratoDao.findAll();
    }

    @Transactional
    public Optional<Contrato> findOne(Long id) {
        return contratoDao.findById(id);
    }

    @Transactional
    public Contrato saveOrUpdate(Contrato contrato) {
        return contratoDao.save(contrato);
    }

    @Transactional
    public void delete(Long id) {
        contratoDao.deleteById(id);
    }
    
}
