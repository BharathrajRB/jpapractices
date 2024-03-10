// package com.jpa.practices.jpapractices.modal;

// import jakarta.persistence.*;

// @Entity
// @Table(name = "address")
// public class address {

//     @Id
//     @Column(name = "employee_id") // Ensure the column name matches the actual database column
//     private Long employeeId;

//     @Column(name = "city")
//     private String city;

//     @Column(name = "state")
//     private String state;

//     @ManyToOne
//     @JoinColumn(name = "employee_id")
//     private Employee employee;

//     public Long getEmployeeId() {
//         return employeeId;
//     }

//     public void setEmployeeId(Long employeeId) {
//         this.employeeId = employeeId;
//     }

//     public String getCity() {
//         return city;
//     }

//     public void setCity(String city) {
//         this.city = city;
//     }

//     public String getState() {
//         return state;
//     }

//     public void setState(String state) {
//         this.state = state;
//     }

//     public Employee getEmployee() {
//         return employee;
//     }

//     public void setEmployee(Employee employee) {
//         this.employee = employee;
//     }

//     // Getters and setters
// }
