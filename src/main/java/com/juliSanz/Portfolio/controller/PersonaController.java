package com.juliSanz.Portfolio.controller;

import com.juliSanz.Portfolio.entity.Persona;
import com.juliSanz.Portfolio.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persona") //localhost:8080/persona
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = {"https://frontend-argprogram.web.app/"})
public class PersonaController {
    
    @Autowired
    PersonaService personServ;
    
    @GetMapping ("/list")
    @ResponseBody
    public List <Persona> getPersonas(){
        return personServ.getPersonas();
    }
    
    @GetMapping ("/view/{id}")
    @ResponseBody
    public Persona viewPersona(@PathVariable int id) {
        return personServ.findPersona(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/create")
    public void addPersona (@RequestBody Persona person) {
        personServ.createPersona(person);
//        return "The Persona was created successfully";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/{id}")
    public void deletePersona(@PathVariable int id) {
        personServ.deletePersona(id);
//        return "The Persona was deleted successfully";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/update")
    public void updatePersona(@RequestBody Persona person) {
        personServ.updatePersona(person);
//        return "The Persona was updated successfully";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/update/{id}")
    public void updatePersonaById(@PathVariable int id, Persona person) {
        personServ.updatePersona(person);
//        return "The Persona was updated successfully";
    }
    
}
