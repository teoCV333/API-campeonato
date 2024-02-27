package com.taller1.campeonato.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.taller1.campeonato.entities.Campeonato;
import com.taller1.campeonato.entities.Grupo;
import com.taller1.campeonato.interfaces.ICampeonatoService;
import com.taller1.campeonato.repositories.CampeonatoRepository;

@Service
public class CampeonatoService implements ICampeonatoService {
    
    private final CampeonatoRepository campeonatoRepo;

    public CampeonatoService(CampeonatoRepository campeonatoRepo) {
        this.campeonatoRepo = campeonatoRepo;
    }

    @Override
    public List<Campeonato> getAll() {
        return campeonatoRepo.findAll();
    }

    @Override
    public List<Grupo> getGrupos(Integer id) {
        var campeonatoBuscado = campeonatoRepo.findById(id);
        if (campeonatoBuscado.isPresent()) {
            var campeonato = campeonatoBuscado.get();
            return campeonato.getGrupos();
        }
        return null;
    }

}
