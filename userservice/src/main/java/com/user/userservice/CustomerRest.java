package com.user.userservice;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.user.userservice.exception.CustomerNotFoundException;

@RestController
public class CustomerRest {

    @Autowired
    private CustomerRepository repo;
    
    //Provides the REST api for the user service

    @GetMapping("/test")
    public String returnTest(){
        return "Connection established! Clear for takeoff!";
    }
    @GetMapping("/users")
    public List<Customer> retrieveAll(){
        return repo.findAll();
    }
    @GetMapping("users/{id}")
    public Customer retrieveCustomer(@PathVariable int id){
        Optional<Customer> cust = repo.findById(id);
        if(!cust.isPresent()){
            throw new CustomerNotFoundException("not found - id: "+ id);
        }
        return cust.get();

    }
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id){
        repo.deleteById(id);
    }
    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@Validated @RequestBody Customer cust){
        Customer saveCust = repo.save(cust);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saveCust.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

}
