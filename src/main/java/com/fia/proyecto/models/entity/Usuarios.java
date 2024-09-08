/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fia.proyecto.models.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JM Gutierrez
 */
@Entity
@Table(name="Usuarios")
public class Usuarios implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="nombres", nullable=false)
    private String nombres;
    @Column(name="apellidos",nullable=false)
    private String apellidos;
    @Column(name="email",nullable=false,unique=true)
    private String email;
    @Column(name="password",nullable=false)
    private String password;
    @Column(name="dni",nullable=false,unique=true)
    private int dni;
    @Column(name="numero",nullable=false)
    private int numero;
    @Column(name="perfil",nullable=true)
    private String perfil;
    @Column(name="pais")
    private String pais;
    @Column(name="ciudad")
    private String ciudad;
    @ManyToOne
    @JoinColumn(name="id_roles")
    private Roles roles;
    @OneToMany(mappedBy="usuario")
    private List<Noticias> listaNoticia;
    @OneToMany(mappedBy="usuario")
    private List<Curso> listCurso;
    @OneToMany(mappedBy="usuario")
    private List<Eventos> listaEvento=new ArrayList<>();
    @OneToOne(mappedBy="usuario", cascade = CascadeType.ALL, fetch= FetchType.LAZY)
    private Administrador administrador;

    public Usuarios(long id, String nombres, String apellidos, String email, String password, int dni, int numero, String perfil, String pais, String ciudad, Roles roles) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.password = password;
        this.dni = dni;
        this.numero = numero;
        this.perfil = perfil;
        this.pais = pais;
        this.ciudad = ciudad;
        this.roles = roles;
    }

    public Usuarios(String nombres, String apellidos, String email, String password, int dni, int numero, String perfil, String pais, String ciudad, Roles roles) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.password = password;
        this.dni = dni;
        this.numero = numero;
        this.perfil = perfil;
        this.pais = pais;
        this.ciudad = ciudad;
        this.roles = roles;
    }

    public Usuarios() {
    }

    public void setListaNoticia(List<Noticias> listaNoticia) {
        this.listaNoticia = listaNoticia;
    }

    public void setListCurso(List<Curso> listCurso) {
        this.listCurso = listCurso;
    }

    public void setListaEvento(List<Eventos> listaEvento) {
        this.listaEvento = listaEvento;
    }

    public List<Noticias> getListaNoticia() {
        return listaNoticia;
    }

    public List<Curso> getListCurso() {
        return listCurso;
    }

    public List<Eventos> getListaEvento() {
        return listaEvento;
    }

    public long getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getDni() {
        return dni;
    }

    public int getNumero() {
        return numero;
    }

    public String getPerfil() {
        return perfil;
    }

    public String getPais() {
        return pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }
    
    
}
