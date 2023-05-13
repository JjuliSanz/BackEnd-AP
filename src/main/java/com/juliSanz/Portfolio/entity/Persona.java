package com.juliSanz.Portfolio.entity;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;



@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Size(min = 1, max = 40, message = "number of characters exceeded")
    private String name;
    
    @NotNull
    @Size(min = 1, max = 40, message = "number of characters exceeded")
    private String lastName;
      
    private int age;
    
    @Size(min = 1, max = 40, message = "number of characters exceeded")
    private String nationality;
    
    @Size(min = 1, max = 40, message = "number of characters exceeded")
    private String title;
    
    @Size(max = 300, message = "number of characters exceeded")
    private String image;
    
    @Column(length= 1000)
    private String description;

    public Persona() {
    }
    
    public Persona(String name, String lastName, int age, String nationality, String title, String image , String description) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.nationality = nationality;
        this.title = title;
        this.image = image;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }         
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
