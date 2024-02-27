package com.taller1.campeonato.contollers;

import org.springframework.web.bind.annotation.RestController;

import com.taller1.campeonato.entities.Campeonato;
import com.taller1.campeonato.entities.Grupo;
import com.taller1.campeonato.interfaces.ICampeonatoService;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/campeonatos")
@CrossOrigin(origins = "http://localhost:4200")
public class CampeonatoController {
    
    private ICampeonatoService servicio;

    public CampeonatoController(ICampeonatoService servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/listar")
    public List<Campeonato> getAll() {
        return servicio.getAll();
    }

    @GetMapping("/grupos/{id}")
    public List<Grupo> getGrupos(@PathVariable int id) {
        return servicio.getGrupos(id);
    }
    
    
}
