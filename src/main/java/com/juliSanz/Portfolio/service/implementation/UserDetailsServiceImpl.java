//
//package com.juliSanz.Portfolio.service.implementation;
//
//import com.juliSanz.Portfolio.entity.User;
//import com.juliSanz.Portfolio.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService{
//
//    
//    @Autowired
//    private UserRepository userRepository;
//    
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = this.userRepository.findByUserName(username);
//        if(user == null){
//            throw new UsernameNotFoundException("User not found");
//        }
//        return user;
//    }
//    
//}
