package com.fia.proyecto.models.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Bolsa_de_trabajo")
public class Bolsa_de_trabajo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "puesto")
    private String puesto;
    @Column(name = "compania")
    private String compania;
    @Column(name = "vacantas")
    private int vacantes;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "idiomas")
    private String idiomas;
    @Column(name = "informacion_adicional")
    private String informacion_adicional;
    @ManyToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name = "id_contrato")
    private Contrato contrato;
    @ManyToOne
    @JoinColumn(name = "id_jornada")
    private Jornada jornada;

}
