
package com.juliSanz.Portfolio.Security.Repository;

import com.juliSanz.Portfolio.Security.Entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface iUserRepository extends JpaRepository<User, Integer>{
    Optional<User> findByUserName(String userName);
     
    boolean existsByUserName(String userName);
    boolean existsByEmail(String email);
}
