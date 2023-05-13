package com.juliSanz.Portfolio.repository;

import com.juliSanz.Portfolio.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends JpaRepository <Education, Integer>{
    
}
