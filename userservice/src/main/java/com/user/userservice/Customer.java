package com.user.userservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable=false)
    private String lastName;

    @Column(nullable=false)
    private String gender;

    @Column(nullable=false)
    private String email;

    @Column(nullable=false)
    private int phone;
    public Customer(String firstName, String lastName, String gender, String email, int phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getGender() {
        return gender;
    }
    public String getEmail() {
        return email;
    }
    public int getPhone() {
        return phone;
    }
    @Override
    public String toString() {
        return "Customer [email=" + email + ", firstName=" + firstName + ", gender=" + gender + ", id=" + id + ", lastName="
                + lastName + ", phone=" + phone + "]";
    }
    
    
}
