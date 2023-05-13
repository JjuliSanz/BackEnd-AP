
//package com.juliSanz.Portfolio.service.implementation;
//
//import com.juliSanz.Portfolio.entity.User;
//import com.juliSanz.Portfolio.entity.UserRole;
//import com.juliSanz.Portfolio.repository.RoleRepository;
//import com.juliSanz.Portfolio.repository.UserRepository;
//import com.juliSanz.Portfolio.service.UserService;
//import java.util.List;
//import java.util.Set;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//
//@Service
//public class UserServiceImpl implements UserService{
//    
//    @Autowired
//    private UserRepository userRepository;
//    
//    @Autowired
//    private RoleRepository roleRepository;
//
//    @Override
//    public User saveUser(User user, Set<UserRole> userRoles) throws Exception {
//        User localUser = userRepository.findByUserName(user.getUserName());
//        if (localUser != null) {
//            System.out.println("The user alredy exists");
//            throw new Exception("The user alredy present");
//        }
//        else {
//            for(UserRole userRole:userRoles){
//                roleRepository.save(userRole.getRole());
//            }
//            user.getUserRoles().addAll(userRoles);
//            localUser = userRepository.save(user);
//        }
//        return localUser;
//    }
//
//    @Override
//    public User getUser(String userName) {
//        return userRepository.findByUserName(userName);
//    }
//
//    @Override
//    public void deleteUser(Long userId) {
//        userRepository.deleteById(userId);
//    }
//    
//    @Override
//    public List<User> getAllUsers() {
//        return userRepository.findAll();
//    }
//
//}
