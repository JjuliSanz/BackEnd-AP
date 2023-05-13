package com.juliSanz.Portfolio.service;

import com.juliSanz.Portfolio.entity.Education;
import com.juliSanz.Portfolio.repository.EducationRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducationService {
    
    @Autowired
    public EducationRepository educationRepo;
    
    public List<Education> getEducations() {
        List<Education> educationsList= educationRepo.findAll();
        return educationsList;
    }
    
    public Education findEducation(int id) {
        Education education = educationRepo.findById(id).orElse(null);
        return education;
    }
    
    public void createEducation(Education education) {
        educationRepo.save(education);
    }
    
    public void updateEducation(Education education) {
        educationRepo.save(education);
    }
    
    public void deleteEducation(int id) {
        educationRepo.deleteById(id);
    }
    
    public void deleteAllEducation() {
        educationRepo.deleteAll();
    }
    
}
