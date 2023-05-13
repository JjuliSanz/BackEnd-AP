package com.juliSanz.Portfolio.repository;

import com.juliSanz.Portfolio.entity.SoftSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftSkillRepository extends JpaRepository <SoftSkill, Integer>{
    
}
