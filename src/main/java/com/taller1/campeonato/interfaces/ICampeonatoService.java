package com.taller1.campeonato.interfaces;

import java.util.List;

import com.taller1.campeonato.entities.Campeonato;
import com.taller1.campeonato.entities.Grupo;

public interface ICampeonatoService {

    public List<Campeonato> getAll();

    public List<Grupo> getGrupos(Integer id);
    
}
