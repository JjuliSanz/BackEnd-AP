package com.juliSanz.Portfolio.controller;

import com.juliSanz.Portfolio.entity.Languaje;
import com.juliSanz.Portfolio.service.LanguajeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("languaje") //localhost:8080/languaje
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = {"https://frontend-argprogram.web.app/"})
public class LanguajeController {
    
    @Autowired
    LanguajeService languajeServ;
    
    @GetMapping ("/list")
    @ResponseBody
    public List <Languaje> getLanguajes(){
        return languajeServ.getLanguajes();
    }
    
    @GetMapping ("/view/{id}")
    @ResponseBody
    public Languaje viewLanguaje(@PathVariable int id) {
        return languajeServ.findLanguaje(id);
    }
    
    @PostMapping ("/create")
    public void addLanguaje (@RequestBody Languaje languaje) {
        languajeServ.createLanguaje(languaje);
//        return "The Languaje was created successfully";
    }
    
    @DeleteMapping ("/delete/{id}")
    public void deleteLanguaje(@PathVariable int id) {
        languajeServ.deleteLanguaje(id);
//        return "The Languaje was deleted successfully";
    }
    
    @PutMapping ("/update")
    public void updateLanguaje(@RequestBody Languaje languaje) {
        languajeServ.updateLanguaje(languaje);
//        return "The Languaje was updated successfully";
    }
    
    @PutMapping ("/update/{id}")
    public void updateLanguajeById(@PathVariable int id, Languaje languaje) {
        languajeServ.updateLanguaje(languaje);
//        return "The Languaje was updated successfully";
    }
    
}
