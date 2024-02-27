package com.taller1.campeonato.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class TablaPosicion {
    
    @Id
    @Column
    private Integer id;

    @Column
    private String pais;

    @Column
    private Integer pJ;

    @Column(nullable = true)
    private Integer pG;

    @Column
    private Integer pE;

    @Column
    private Integer pP;

    @Column
    private Integer gF;

    @Column
    private Integer gC;

    @Column(nullable = true)
    private Integer puntos;

    public TablaPosicion() {

    }

    public TablaPosicion(int id, String pais, int pJ, Integer pG, int pE, int pP, int gF, int gC, int puntos) {
        this.id = id;
        this.pais = pais;
        this.pJ = pJ;
        this.pG = pG;
        this.pE = pE;
        this.pP = pP;
        this.gF = gF;
        this.gC = gC;
        this.puntos = puntos;
    }

    public Integer getpG() {
        return pG != null ? pG : 0;
    }

    public Integer getpuntos() {
        return puntos != null ? puntos : 0;
    }

}
