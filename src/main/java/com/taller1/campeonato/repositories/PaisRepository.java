package com.taller1.campeonato.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.taller1.campeonato.entities.Pais;

public interface PaisRepository  extends JpaRepository<Pais, Long> {
    
}
