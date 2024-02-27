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
@Table(name="campeonato")
public class Campeonato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_campeonato")
    @GenericGenerator(name = "secuencia_campeonato", strategy = "increment")
    private Integer id;

    @Column(name = "campeonato", length = 100, unique = true)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "idpais", referencedColumnName = "id")
    private Pais pais;

    @Column(name = "año")
    private int año;

    @JsonIgnore
    @OneToMany(mappedBy = "campeonato")
    private List<Grupo> grupos = new ArrayList<>();

    public Campeonato() {

    }

    public Campeonato(Integer id, String nombre, Pais pais, int año) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.año = año;
    }

    public Campeonato(Integer id, String nombre, Pais pais, int año, List<Grupo> grupos) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.año = año;
        this.grupos = grupos;
    }
}
