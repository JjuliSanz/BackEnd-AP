package com.juliSanz.Portfolio.controller;

import com.juliSanz.Portfolio.entity.HardSkill;
import com.juliSanz.Portfolio.service.HardSkillService;
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
@RequestMapping("hardSkill") //localhost:8080/hardSkill
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = {"https://frontend-argprogram.web.app/"})
public class HardSkillController {
    
    @Autowired
    HardSkillService hardSkillServ;
    
    @GetMapping ("/list")
    @ResponseBody
    public List <HardSkill> getHardSkills(){
        return hardSkillServ.getHardSkills();
    }
    
    @GetMapping ("/view/{id}")
    @ResponseBody
    public HardSkill viewHardSkill(@PathVariable int id) {
        return hardSkillServ.findHardSkill(id);
    }
    
    @PostMapping ("/create")
    public void addHardSkill (@RequestBody HardSkill hardSkill) {
        hardSkillServ.createHardSkill(hardSkill);
//        return "The HardSkill was created successfully";
    }
    
    @DeleteMapping ("/delete/{id}")
    public void deleteHardSkill(@PathVariable int id) {
        hardSkillServ.deleteHardSkill(id);
//        return "The HardSkill was deleted successfully";
    }
    
    @PutMapping ("/update")
    public void updateHardSkill(@RequestBody HardSkill hardSkill) {
        hardSkillServ.updateHardSkill(hardSkill);
//        return "The HardSkill was updated successfully";
    }
    
    @PutMapping ("/update/{id}")
    public void updateHardSkillById(@PathVariable int id, HardSkill hardSkill) {
        hardSkillServ.updateHardSkill(hardSkill);
//        return "The HardSkill was updated successfully";
    }
}
