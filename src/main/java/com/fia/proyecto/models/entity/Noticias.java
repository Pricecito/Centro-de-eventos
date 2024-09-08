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
@Table(name="Noticia")
public class Noticias {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="titulo")
    private String titulo;
    @PrePersist
    public void prePersist() {
        fecha = new Date();
    }
    @Column(name = "fecha")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="img")
    private String img;
    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuarios usuario;
    

    public Noticias(long id, String titulo,String descripcion,String img, Usuarios usuario) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.img=img;
        this.usuario = usuario;
    }

    public Noticias(String titulo, String descripcion, String img,Usuarios usuario) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.img=img;
        this.usuario = usuario;
    }

    public Noticias() {
    }

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
    
}
