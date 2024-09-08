/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 *
 * @author JM Gutierrez
 */
@Entity
@Table(name="Administrador")
public class Administrador {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_usuario")
    private Usuarios usuario;

    public Administrador(long id, Usuarios usuario) {
        this.id = id;
        this.usuario = usuario;
    }

    public Administrador(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Administrador() {
    }

    public long getId() {
        return id;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
    
    
    
    
}
