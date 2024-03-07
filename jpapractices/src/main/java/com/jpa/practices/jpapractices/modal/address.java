package com.jpa.practices.jpapractices.modal;

import jakarta.persistence.*; 
  
@Entity
@Table(name = "address") 
public class address { 
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id") 
    private int id; 
  
    @Column(name = "city") 
    private String city; 
  
    @Column(name = "state") 
    private String state; 
  
    public int getId() { 
        return id; 
    } 
  
    public void setId(int id) { 
        this.id = id; 
    } 
  
    public String getCity() { 
        return city; 
    } 
  
    public void setCity(String city) { 
        this.city = city; 
    } 
  
    public String getState() { 
        return state; 
    } 
  
    public void setState(String state) { 
        this.state = state; 
    } 
} 