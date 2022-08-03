package com.user.userservice;

public class User {
    private int id;
    private String firstName, lastName, gender, email;
    private int phone;
    public User(int id, String firstName, String lastName, String gender, String email, int phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "User [email=" + email + ", firstName=" + firstName + ", gender=" + gender + ", id=" + id + ", lastName="
                + lastName + ", phone=" + phone + "]";
    }
    
    
}
