package com.juliSanz.Portfolio.repository;

import com.juliSanz.Portfolio.entity.Languaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguajeRepository extends JpaRepository <Languaje, Integer>{
    
}
