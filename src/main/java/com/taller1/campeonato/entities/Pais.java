package com.taller1.campeonato.entities;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "pais")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_pais")
    @GenericGenerator(name = "secuencia_pais", strategy = "increment")
    private Integer id;

    @Column(length = 100, unique = true)
    private String pais;

    @Column(length = 100, unique = true)
    private String entidad;

    public Pais() {
    }

    public Pais(String nombre, String entidad) {
        this.pais = nombre;
        this.entidad = entidad;
    }

}
