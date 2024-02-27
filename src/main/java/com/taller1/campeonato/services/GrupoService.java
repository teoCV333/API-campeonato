package com.taller1.campeonato.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.taller1.campeonato.entities.TablaPosicion;
import com.taller1.campeonato.interfaces.IGrupoService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class GrupoService implements IGrupoService{

    @PersistenceContext
    public EntityManager em;

    @Override
    public List<TablaPosicion> getPosiciones(int idGrupo) {
        List<TablaPosicion> tablaPosiciones = em
            .createNativeQuery("SELECT * FROM fTablaPosicionesGrupo(:idgrupotabla)", TablaPosicion.class)
                .setParameter("idgrupotabla", idGrupo)
                .getResultList();
        return tablaPosiciones;
    }

}
