package com.taller1.campeonato.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "grupopais")
public class GrupoPais {
    
    @Id
    @ManyToOne
    @JoinColumn(name = "idgrupo", referencedColumnName = "id")
    private Grupo grupo;

    @Id
    @ManyToOne
    @JoinColumn(name = "idpais", referencedColumnName = "id")
    private Pais seleccion;

    public GrupoPais() {

    }

    public GrupoPais(Grupo grupo, Pais seleccion) {
        this.grupo = grupo;
        this.seleccion = seleccion;
    }

}
