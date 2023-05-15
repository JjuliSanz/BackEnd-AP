
package com.juliSanz.Portfolio.Security.Repository;

import com.juliSanz.Portfolio.Security.Entity.Role;
import com.juliSanz.Portfolio.Security.Enums.RoleName;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRoleRepository extends JpaRepository<Role, Integer>{
    Optional<Role> findByRoleName(RoleName roleName);
}
