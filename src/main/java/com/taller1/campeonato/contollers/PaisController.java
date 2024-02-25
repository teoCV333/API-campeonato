package com.taller1.campeonato.contollers;

import org.springframework.web.bind.annotation.RestController;

import com.taller1.campeonato.entities.Pais;
import com.taller1.campeonato.interfaces.IPaisService;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/pais")
@CrossOrigin(origins = "http://localhost:4200")
public class PaisController {
    
    private final IPaisService paisService;

    public PaisController(IPaisService paisService) {
        this.paisService = paisService;
    }

    @PostMapping
    public Pais create(@RequestBody Pais data) {
        return paisService.create(data);    
    }

    @GetMapping("/{id}")
    public Pais getOne(@PathVariable Long id) {
        return paisService.getOne(id);
    }

    @GetMapping
    public List<Pais> getAll() {
        return paisService.getAll();
    }

    @PutMapping("/{id}")
    public Pais update(@PathVariable Long id, @RequestBody Pais data) {
        return paisService.update(id, data);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return paisService.delete(id);
    }

}
    
