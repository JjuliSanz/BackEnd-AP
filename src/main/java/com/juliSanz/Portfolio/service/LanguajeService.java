package com.juliSanz.Portfolio.service;

import com.juliSanz.Portfolio.entity.Languaje;
import com.juliSanz.Portfolio.repository.LanguajeRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LanguajeService {
    
    @Autowired
    public LanguajeRepository languajeRepo;
    
    public List<Languaje> getLanguajes() {
        List<Languaje> languajesList= languajeRepo.findAll();
        return languajesList;
    }
    
    public Languaje findLanguaje(int id) {
        Languaje languaje = languajeRepo.findById(id).orElse(null);
        return languaje;
    }
    
    public void createLanguaje(Languaje languaje) {
        languajeRepo.save(languaje);
    }
    
    public void updateLanguaje(Languaje languajea) {
        languajeRepo.save(languajea);
    }
    
    public void deleteLanguaje(int id) {
        languajeRepo.deleteById(id);
    }
    
}