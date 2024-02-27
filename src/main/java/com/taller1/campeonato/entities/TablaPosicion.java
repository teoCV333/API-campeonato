package com.taller1.campeonato.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Builder
public class TablaPosicion {
    
    @Id
    @Column
    private Integer id;

    @Column
    private String pais;

    @Column
    @Builder.Default
    private Integer pJ = 0;

    @Column
    @Builder.Default
    private Integer pG = 0;

    @Column
    @Builder.Default
    private Integer pE = 0;

    @Column
    @Builder.Default
    private Integer pP = 0;

    @Column
    @Builder.Default
    private Integer gF = 0;

    @Column
    @Builder.Default
    private Integer gC = 0;

    @Column
    @Builder.Default
    private Integer puntos = 0;

    public TablaPosicion() {

    }

    public TablaPosicion(Integer id, String pais, Integer pJ, Integer pG, Integer pE, Integer pP, Integer gF, Integer gC, Integer puntos) {
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
