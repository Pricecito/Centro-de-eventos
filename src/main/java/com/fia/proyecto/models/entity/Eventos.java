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
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author JM Gutierrez
 */
@Entity
@Table(name="Eventos")
public class Eventos {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="direccion")
    private String direccion;
    @PrePersist
    public void prePersist() {
        fechaCreacion = new Date();
    }
    @Column(name = "fechaCreacion")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Column(name = "fechaInicio")
    private String fechaInicio;
    @Column(name = "fechaFin")
    private String fechaFin;
    @Column(name = "img")
    private String img;
    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuarios usuario;
    
    public Eventos(long id, String nombre, String descripcion, String direccion, String fechaInicio, String fechaFin, String img, Usuarios usuario) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.img = img;
        this.usuario = usuario;
    }

    public Eventos(String nombre, String descripcion, String direccion, String fechaInicio, String fechaFin, String img, Usuarios usuario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.img = img;
        this.usuario = usuario;
    }

    public Eventos() {
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
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

    public String getDireccion() {
        return direccion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public String getImg() {
        return img;
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

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
