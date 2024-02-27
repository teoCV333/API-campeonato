package com.taller1.campeonato.contollers;

import org.springframework.web.bind.annotation.RestController;

import com.taller1.campeonato.entities.TablaPosicion;
import com.taller1.campeonato.interfaces.IGrupoService;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/grupos")
@CrossOrigin(origins = "http://localhost:4200")
public class GrupoController {
    
    private final IGrupoService servicio;

    public GrupoController(IGrupoService servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/posiciones/{id}")
    public List<TablaPosicion> obtenerPosiciones(@PathVariable int id) {
        return servicio.getPosiciones(id);
    }
    
}
