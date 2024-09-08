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
@Table(name="Contrato")
public class Contrato {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Column(name="nombre")
    private String nombre;
    @OneToMany(mappedBy="contrato")
    private List<Bolsa_de_trabajo> listaBolsa_de_trabajo;

    public Contrato(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Contrato(String nombre) {
        this.nombre = nombre;
    }

    public Contrato() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
