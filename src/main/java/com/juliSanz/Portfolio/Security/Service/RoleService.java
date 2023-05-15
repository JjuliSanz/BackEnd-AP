
package com.juliSanz.Portfolio.Security.Service;

import com.juliSanz.Portfolio.Security.Entity.Role;
import com.juliSanz.Portfolio.Security.Enums.RoleName;

import com.juliSanz.Portfolio.Security.Repository.iRoleRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RoleService {
    
    @Autowired
    iRoleRepository iroleRepository;
    
    public Optional<Role> getByRoleName(RoleName roleName){
        return iroleRepository.findByRoleName(roleName);
    }
    
    public void save(Role role){
        iroleRepository.save(role);
    }
}
