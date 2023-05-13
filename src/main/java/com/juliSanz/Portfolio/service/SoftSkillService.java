package com.juliSanz.Portfolio.service;

import com.juliSanz.Portfolio.entity.SoftSkill;
import com.juliSanz.Portfolio.repository.SoftSkillRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SoftSkillService {
    
    @Autowired
    public SoftSkillRepository softSkillRepo;
    
    public List<SoftSkill> getSoftSkills() {
        List<SoftSkill> softSkillList= softSkillRepo.findAll();
        return softSkillList;
    }
    
    public SoftSkill findSoftSkill(int id) {
        SoftSkill softSkill = softSkillRepo.findById(id).orElse(null);
        return softSkill;
    }
    
    public void createSoftSkill(SoftSkill softSkill) {
        softSkillRepo.save(softSkill);
    }
    
    public void updateSoftSkill(SoftSkill softSkilla) {
        softSkillRepo.save(softSkilla);
    }
    
    public void deleteSoftSkill(int id) {
        softSkillRepo.deleteById(id);
    }
    
}