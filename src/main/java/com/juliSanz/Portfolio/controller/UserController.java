//package com.juliSanz.Portfolio.controller;
//
//import com.juliSanz.Portfolio.entity.Role;
//import com.juliSanz.Portfolio.entity.User;
//import com.juliSanz.Portfolio.entity.UserRole;
//import com.juliSanz.Portfolio.service.UserService;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/user")
//@CrossOrigin(origins = "http://localhost:4200")
////@CrossOrigin("*")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @PostMapping("/save")
//    public User saveUser(@RequestBody User user) throws Exception {
//        Set<UserRole> userRoles = new HashSet<>();
//
//        Role role = new Role();
//        role.setRoleId(2L);
//        role.setName("NORMAL");
//
//        UserRole userRole = new UserRole();
//        userRole.setUser(user);
//        userRole.setRole(role);
//        
//        userRoles.add(userRole);
//
//        return userService.saveUser(user, userRoles);
//    }
//
//    @GetMapping("/{userName}")
//    public User getUser(@PathVariable("userName") String userName) {
//        return userService.getUser(userName);
//    }
//
//    @DeleteMapping("/{userId}")
//    public void deleteUser(@PathVariable("userId") Long userId) {
//        userService.deleteUser(userId);
//    }
//
//    @GetMapping("/list")
//    @ResponseBody
//    public List <User> getAllUsers(){
//        return userService.getAllUsers();
//    }
//    public String getUsers(Model model) {
//        List<User> users = userService.getAllUsers();
//        user.addAttribute("users", users);
//        return "users";
//    }
//}
