/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fia.proyecto.models.dao;

import com.fia.proyecto.models.entity.Noticias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JM Gutierrez
 */
@Repository
public interface NoticiasDAO extends JpaRepository<Noticias,Long>{
}