package com.juliSanz.Portfolio;

//import com.juliSanz.Portfolio.entity.Role;
//import com.juliSanz.Portfolio.entity.User;
//import com.juliSanz.Portfolio.entity.UserRole;
//import com.juliSanz.Portfolio.service.UserService;
//import java.util.HashSet;
//import java.util.Set;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
//public class PortfolioApplication implements CommandLineRunner {
@SpringBootApplication
public class PortfolioApplication {

//    @Autowired
//    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(PortfolioApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
////        User user = new User();
////        
////        user.setName("Julian");
////        user.setLastName("Sanz");
////        user.setUserName("juli");
////        user.setEmail("jjulisanz@gmail.com");
////        user.setPassword("1234");
////        
////        Role role = new Role();
////        role.setRoleId(1L);
////        role.setName("ADMIN");
////        
////        Set<UserRole> userRoles = new HashSet<>();
////        UserRole userRole = new UserRole();
////        userRole.setRole(role);
////        userRole.setUser(user);
////        userRoles.add(userRole);
////        
////        User userSaved = userService.saveUser(user, userRoles);
////        System.out.println(userSaved.getUserName());
//    }

}
