package com.taller1.campeonato.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taller1.campeonato.entities.Pais;

@Repository
public interface PaisRepository  extends JpaRepository<Pais, Long> {
    
}
