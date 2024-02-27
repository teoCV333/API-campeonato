package com.taller1.campeonato.entities;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@ToString
@Table(name="grupo")
public class Grupo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_grupo")
    @GenericGenerator(name = "secuencia_grupo", strategy = "increment")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idcampeonato", referencedColumnName = "id")
    private Campeonato campeonato;

    @Column(name = "grupo", length = 5)
    private String nombre;
    
    @JsonIgnore
    @OneToMany(mappedBy = "grupo")
    private List<GrupoPais> selecciones = new ArrayList<>();

    public Grupo() {

    }

    public Grupo(Integer id, Campeonato campeonato, String nombre) {
        this.id = id;
        this.campeonato = campeonato;
        this.nombre = nombre;
    }

    public Grupo(Integer id, Campeonato campeonato, String nombre, List<GrupoPais> selecciones) {
        this.id = id;
        this.campeonato = campeonato;
        this.nombre = nombre;
        this.selecciones = selecciones;
    }
    
}
