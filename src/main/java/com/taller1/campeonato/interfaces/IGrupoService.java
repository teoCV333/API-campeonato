package com.taller1.campeonato.interfaces;

import java.util.List;

import com.taller1.campeonato.entities.TablaPosicion;

public interface IGrupoService {
    
    public List<TablaPosicion> getPosiciones(int id);

}
