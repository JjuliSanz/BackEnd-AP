package com.juliSanz.Portfolio.controller;

import com.juliSanz.Portfolio.entity.Education;
import com.juliSanz.Portfolio.service.EducationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
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
@RequestMapping("education") //localhost:8080/education
//@CrossOrigin(origins = {"http://localhost:4200"})
@CrossOrigin(origins = {"https://frontend-argprogram.web.app/"})

//@CrossOrigin(origins = "*")
public class EducationController {
    
    @Autowired
    EducationService educationServ;
    
    @GetMapping ("/list")
    @ResponseBody    
    public ResponseEntity <List <Education>> getEducations(){
        List<Education> list = educationServ.getEducations();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping ("/view/{id}")
    @ResponseBody
    public Education viewEducation(@PathVariable int id) {
        return educationServ.findEducation(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/create")
    public void addEducation (@RequestBody Education education) {
        educationServ.createEducation(education);
//        return "The Education was created successfully";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/{id}")
    public void deleteEducation(@PathVariable int id) {
        educationServ.deleteEducation(id);
//        return "The Education was deleted successfully";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete")
    public void deleteAllEducation() {
        educationServ.deleteAllEducation();
//        return "The Educations was deleted successfully";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/update")
    public void updateEducation(@RequestBody Education education) {
        educationServ.updateEducation(education);
//        return "The Education was updated successfully";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/update/{id}")
    public void updateEducationById(@PathVariable int id, Education education) {
        educationServ.updateEducation(education);
//        return "The Education was updated successfully";
    }
    
}