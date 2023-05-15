
package com.juliSanz.Portfolio.Security.Service;

import com.juliSanz.Portfolio.Security.Entity.User;
import com.juliSanz.Portfolio.Security.Repository.iUserRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
    
    @Autowired
    iUserRepository iuserRepository;
    
    public Optional<User> getByUserName(String userName){
        return iuserRepository.findByUserName(userName);
    }
    
    public boolean existsByUserName(String userName){
        return iuserRepository.existsByUserName(userName);
    }
    
    public boolean existsByEmail(String email){
        return iuserRepository.existsByEmail(email);
    }
    
    public void save(User user){
        iuserRepository.save(user);
    }
}
