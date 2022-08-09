package com.main.maindriver;

//"Dumb" java recreation of Customer class to assist in testing the Main Driver
public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private int phone;

    public Customer(int id, String firstName, String lastName, String gender, String email, int phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }
    public Customer(){}
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(int phone) {
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
        return "Customer [id=" + id + ",firstName=" + firstName + ", lastName=" 
                          + lastName + ", gender=" + gender + ", email=" + email + ",  phone=" + phone + "]";
    }
}
    
    