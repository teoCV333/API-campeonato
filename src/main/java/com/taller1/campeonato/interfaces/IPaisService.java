package com.taller1.campeonato.interfaces;

import java.util.List;

import com.taller1.campeonato.entities.Pais;

public interface IPaisService {

    Pais create(Pais data);

    Pais getOne(Long id);

    List<Pais> getAll();

    Pais update(Long id, Pais data);

    String delete(Long id);

}
