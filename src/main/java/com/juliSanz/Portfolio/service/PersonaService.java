package com.juliSanz.Portfolio.service;

import com.juliSanz.Portfolio.entity.Persona;
import com.juliSanz.Portfolio.repository.PersonaRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonaService {
    
    @Autowired
    public PersonaRepository personRepo;
    
    public List<Persona> getPersonas() {
        List<Persona> personasList= personRepo.findAll();
        return personasList;
    }
    
    public Persona findPersona(int id) {
        Persona person = personRepo.findById(id).orElse(null);
        return person;
    }
    
    public void createPersona(Persona persona) {
        personRepo.save(persona);
    }
    
    public void updatePersona(Persona persona) {
        personRepo.save(persona);
    }
    
    public void deletePersona(int id) {
        personRepo.deleteById(id);
    }
    
}
