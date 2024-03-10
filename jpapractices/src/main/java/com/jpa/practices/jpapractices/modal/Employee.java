// package com.jpa.practices.jpapractices.modal;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;

// @Entity
// @Table(name = "employee")
// public class Employee {

//   @Id
//   @GeneratedValue(strategy = GenerationType.IDENTITY)
//   @Column(name = "id")
//   private int id;

//   @Column(name = "name")
//   private String name;

//   @Column(name = "email")
//   private String email;

//   @Column(name = "age") // Add this annotation
//   private int age;

//   public int getId() {
//     return id;
//   }

//   public void setId(int id) {
//     this.id = id;
//   }

//   public String getName() {
//     return name;
//   }

//   public void setName(String name) {
//     this.name = name;
//   }

//   public String getEmail() {
//     return email;
//   }

//   public void setEmail(String email) {
//     this.email = email;
//   }

//   public int getAge() {
//     return age;
//   }

//   public void setAge(int age) {
//     this.age = age;
//   }

//   // Getters and setters
// }
