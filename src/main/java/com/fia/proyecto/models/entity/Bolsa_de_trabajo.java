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
@Table(name="Bolsa_de_trabajo")
public class Bolsa_de_trabajo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="puesto")
    private String puesto;
    @Column(name="compania")
    private String compania;
    @Column(name="vacantas")
    private int vacantes;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="idiomas")
    private String idiomas;
    @Column(name="informacion_adicional")
    private String informacion_adicional;
    @ManyToOne
    @JoinColumn(name="id_contrato")
    private Contrato contrato;
    @ManyToOne
    @JoinColumn(name="id_jornada")
    private Jornada jornada;
    
    public Bolsa_de_trabajo(int id, String puesto, String compania, int vacantes, String descripcion, String idiomas, String informacion_adicional, Contrato contrato, Jornada jornada) {
        this.id = id;
        this.puesto = puesto;
        this.compania = compania;
        this.vacantes = vacantes;
        this.descripcion = descripcion;
        this.idiomas = idiomas;
        this.informacion_adicional = informacion_adicional;
        this.contrato = contrato;
        this.jornada = jornada;
    }

    
    public Bolsa_de_trabajo(String puesto, String compania, int vacantes, String descripcion, String idiomas, String informacion_adicional, Contrato contrato, Jornada jornada) {
        this.puesto = puesto;
        this.compania = compania;
        this.vacantes = vacantes;
        this.descripcion = descripcion;
        this.idiomas = idiomas;
        this.informacion_adicional = informacion_adicional;
        this.contrato = contrato;
        this.jornada = jornada;
    }

    public Bolsa_de_trabajo() {
    }

    public Jornada getJornada() {
        return jornada;
    }

    public void setJornada(Jornada jornada) {
        this.jornada = jornada;
    }
    
    public int getId() {
        return id;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getCompañia() {
        return compania;
    }

    public int getVacantes() {
        return vacantes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setCompañia(String compañia) {
        this.compania = compañia;
    }

    public void setVacantes(int vacantes) {
        this.vacantes = vacantes;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public String getInformacion_adicional() {
        return informacion_adicional;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public void setInformacion_adicional(String informacion_adicional) {
        this.informacion_adicional = informacion_adicional;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
    
}
