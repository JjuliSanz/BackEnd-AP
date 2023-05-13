package com.juliSanz.Portfolio.service;

import com.juliSanz.Portfolio.entity.HardSkill;
import com.juliSanz.Portfolio.repository.HardSkillRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HardSkillService {
    
    @Autowired
    public HardSkillRepository hardSkillRepo;
    
    public List<HardSkill> getHardSkills() {
        List<HardSkill> hardSkillList= hardSkillRepo.findAll();
        return hardSkillList;
    }
    
    public HardSkill findHardSkill(int id) {
        HardSkill person = hardSkillRepo.findById(id).orElse(null);
        return person;
    }
    
    public void createHardSkill(HardSkill hardSkill) {
        hardSkillRepo.save(hardSkill);
    }
    
    public void updateHardSkill(HardSkill hardSkill) {
        hardSkillRepo.save(hardSkill);
    }
    
    public void deleteHardSkill(int id) {
        hardSkillRepo.deleteById(id);
    }
    
}
