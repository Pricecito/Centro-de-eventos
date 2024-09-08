/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

/**
 *
 * @author JM Gutierrez
 */
@Entity
@Table(name="Roles")
public class Roles {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="nombre")
    private String nombre;
    @OneToMany(mappedBy="roles")
    private List<Usuarios> listaUsuarios;

    public Roles(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Roles(String nombre) {
        this.nombre = nombre;
    }

    public Roles() {
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Usuarios> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuarios> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
}
