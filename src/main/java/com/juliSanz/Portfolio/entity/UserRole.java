//
//package com.juliSanz.Portfolio.entity;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;
//
//@Entity
//
//public class UserRole {
//    
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long userRolId;
//    
//    @ManyToOne(fetch = FetchType.EAGER)
//    private User user;
//    
//    @ManyToOne
//    private Role role;
//
//    public UserRole() {
//    }
//
//    public Long getUserRolId() {
//        return userRolId;
//    }
//
//    public void setUserRolId(Long userRolId) {
//        this.userRolId = userRolId;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public Role getRole() {
//        return role;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }
//    
//    
//}
