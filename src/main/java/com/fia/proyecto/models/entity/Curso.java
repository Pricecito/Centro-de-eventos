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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author JM Gutierrez
 */
@Entity
@Table(name="Cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="descripcion")
    private String descripcion;
    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuarios usuario;

    public Curso(long id, String nombre, String descripcion, Usuarios usuario) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.usuario = usuario;
    }

    public Curso(String nombre, String descripcion, Usuarios usuario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.usuario = usuario;
    }

    public Curso() {
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuario = usuarios;
    }

    public Usuarios getUsuarios() {
        return usuario;
    }

}
