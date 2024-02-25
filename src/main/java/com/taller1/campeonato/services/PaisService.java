package com.taller1.campeonato.services;

import com.taller1.campeonato.entities.Pais;
import com.taller1.campeonato.interfaces.IPaisService;
import com.taller1.campeonato.repositories.PaisRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collections;
import java.util.List;

@Service
public class PaisService implements IPaisService {

    private final PaisRepository paisRepo;

    public PaisService(PaisRepository paisRepo) {
        this.paisRepo = paisRepo;
    }

    @Override
    public Pais create(Pais data) {

        try {
            return paisRepo.save(data);
        } catch (Exception e) {
            throw new RuntimeException("Error creating Pais", e);
        }

    }

    @Override
    public Pais getOne(Long id) {

        try {
            return paisRepo.findById(id)
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                            "No se encontró un pais con el id: " + id));
        } catch (Exception e) {
            throw new RuntimeException("Error del servidor, por favor comuniquese con el administrador", e);
        }

    }

    @Override
    public List<Pais> getAll() {

        try {
            return paisRepo.findAll().size() > 0 ? paisRepo.findAll() : Collections.emptyList();
        } catch (Exception e) {
            throw new RuntimeException("Error del servidor, por favor comuniquese con el administrador", e);
        }

    }

    @Override
    public Pais update(Long id, Pais data) {

        try {
            return paisRepo.findById(id)
                    .map(existingPais -> {
                        existingPais.setPais(data.getPais());
                        existingPais.setEntidad(data.getEntidad());
                        return paisRepo.save(existingPais);
                    })
                    .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                            "No se encontró un pais con el id: " + id));

        } catch (Exception e) {
            throw new RuntimeException("Error del servidor, por favor comuniquese con el administrador", e);
        }

    }

    @Override
    public String delete(Long id) {

        Pais existingPais = paisRepo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "No se encontró un pais con id: " + id));

        try {
            paisRepo.delete(existingPais);
            return "deleted";
        } catch (Exception e) {
            throw new RuntimeException("Error del servidor, por favor comuniquese con el administrador", e);
        }

    }

}
