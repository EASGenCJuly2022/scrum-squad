package com.cognizant.scrum;

public class Data {
    public Customer customer;

    public boolean existsCustomer(){
        if(customer != null){
            return true;
        }else{
            return false;
        }
    }
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
}
