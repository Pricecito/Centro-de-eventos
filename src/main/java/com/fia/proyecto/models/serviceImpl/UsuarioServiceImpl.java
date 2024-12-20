/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.models.serviceImpl;

import com.fia.proyecto.models.dao.UsuarioDAO;
import com.fia.proyecto.models.entity.Usuarios;
import com.fia.proyecto.models.service.IService;
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
public class UsuarioServiceImpl implements IService<Usuarios> {
    @Autowired
    private UsuarioDAO usuariosDAO;

    public List<Usuarios> findAll() {
        return (List<Usuarios>) usuariosDAO.findAll();
    }

    public Optional<Usuarios> findOne(Long id) {
        return usuariosDAO.findById(id);
    }

    public Usuarios saveOrUpdate(Usuarios usuario) {
        return usuariosDAO.save(usuario);
    }

    public void delete(Long id) {
        usuariosDAO.deleteById(id);
    }

    public boolean buscarEmail(Usuarios usuario) {
        for (Usuarios us : findAll()) {
            if (usuario.getEmail().equals(us.getEmail()) && usuario.getPassword().equals( us.getPassword())) {
                return true;
            }
        }
        return false;
    }

    public Usuarios buscarXDNI(Usuarios usuario) {
        for (Usuarios us : findAll()) {
            if (usuario.getDni() == (us.getDni())) {
                return us;
            }
        }
        return null;
    }

    public boolean buscarDNI(Usuarios usuario) {
        for (Usuarios us : findAll()) {
            if (usuario.getDni() == (us.getDni())) {
                return true;
            }
        }
        return false;
    }

    public boolean repeticionDNI(Usuarios usuario) {
        for (Usuarios us : findAll()) {
            if (usuario.getDni() == (us.getDni())) {
                return true;
            }
        }
        return false;
    }

    public boolean verificarPassword(Usuarios usuario) {
        for (Usuarios us : findAll()) {
            if (usuario.getPassword().equals(us.getPassword())) {
                return true;
            }
        }
        return false;
    }

    public Usuarios buscarXEmail(Usuarios usuario) {
        for (Usuarios us : findAll()) {
            if (usuario.getEmail().equals(us.getEmail()) && usuario.getPassword().equals(us.getPassword())) {
                return us;
            }
        }
        return null;
    }

}
