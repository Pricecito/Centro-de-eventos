/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.models.serviceImpl;

import com.fia.proyecto.models.dao.UsuarioDAO;
import com.fia.proyecto.models.entity.Usuarios;
import com.fia.proyecto.models.service.UsuarioService;
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
public class UsuarioServiceImpl implements UsuarioService{
    @Autowired
    private UsuarioDAO usuariosDAO;
    
    @Transactional(readOnly = true)
    public List<Usuarios> findAll() {
        return (List<Usuarios>)usuariosDAO.findAll();
    }
    @Transactional(readOnly = true)
    public Optional<Usuarios> findOne(Long id) {
        return usuariosDAO.findById(id);
    }
    @Transactional
    public Usuarios saveOrUpdate(Usuarios usuario) {
        return usuariosDAO.save(usuario);
    }
    @Transactional
    public void delete(Long id) {
        usuariosDAO.deleteById(id);
    }
    @Transactional
    public boolean buscarEmail(Usuarios usuario) {
        for (Usuarios us:findAll()) {	
            if(usuario.getEmail().equals(us.getEmail()) && usuario.getPassword().equals(us.getPassword())) {				
                    return true;				
            }			
        }
        return false;
    }
    @Transactional
    public Usuarios buscarXDNI(Usuarios usuario) {
        for(Usuarios us:findAll()){
            if(usuario.getDni()==(us.getDni())) {				
                return us;			
            }
        }
        return null;
    }

    @Transactional
    public boolean buscarDNI(Usuarios usuario) {
        for(Usuarios us:findAll()){
            if(usuario.getDni()==(us.getDni())) {				
                return true;			
            }
        }
        return false;
    }

    @Transactional
    public boolean repeticionDNI(Usuarios usuario) {
        for(Usuarios us:findAll()){
            if(usuario.getDni()==(us.getDni())) {				
                return true;			
            }
        }
        return false;
    }

    @Transactional
    public boolean verificarPassword(Usuarios usuario) {
        for(Usuarios us:findAll()){
            if(usuario.getPassword().equals(us.getPassword())) {				
                return true;			
            }
        }
        return false;
    }

    @Transactional
    public Usuarios buscarXEmail(Usuarios usuario) {
        for (Usuarios us:findAll()) {	
            if(usuario.getEmail().equals(us.getEmail()) && usuario.getPassword().equals(us.getPassword())) {				
                    return us;				
            }			
        }
        return null;
    }

}
