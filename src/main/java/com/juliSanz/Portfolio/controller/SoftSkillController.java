package com.juliSanz.Portfolio.controller;

import com.juliSanz.Portfolio.entity.SoftSkill;
import com.juliSanz.Portfolio.service.SoftSkillService;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("softSkill") //localhost:8080/softSkill
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = {"https://frontend-argprogram.web.app/"})
public class SoftSkillController {
    
    @Autowired
    SoftSkillService softSkillServ;
    
    @GetMapping ("/list")
    @ResponseBody
    public List <SoftSkill> getSoftSkills(){
        return softSkillServ.getSoftSkills();
    }
    
    @GetMapping ("/view/{id}")
    @ResponseBody
    public SoftSkill viewSoftSkill(@PathVariable int id) {
        return softSkillServ.findSoftSkill(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/create")
    public void addSoftSkill (@RequestBody SoftSkill softSkill) {
        softSkillServ.createSoftSkill(softSkill);
//        return "The SoftSkill was created successfully";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/delete/{id}")
    public void deleteSoftSkill(@PathVariable int id) {
        softSkillServ.deleteSoftSkill(id);
//        return "The SoftSkill was deleted successfully";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/update")
    public void updateSoftSkill(@RequestBody SoftSkill softSkill) {
        softSkillServ.updateSoftSkill(softSkill);
//        return "The SoftSkill was updated successfully";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/update/{id}")
    public void updateSoftSkillById(@PathVariable int id, SoftSkill softSkill) {
        softSkillServ.updateSoftSkill(softSkill);
//        return "The SoftSkill was updated successfully";
    }
}
