package com.user.userservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerCLR implements CommandLineRunner{
    private static final Logger log = LoggerFactory.getLogger(CustomerCLR.class);

    @Autowired
    private CustomerRepository repo;

    @Override
    public void run(String... args) throws Exception {
        Customer cust = new Customer("Jim", "Beaux", "Ford F150", "jim@bob.com", 12345);
        repo.save(cust);
        log.info("New Customer is: " + cust);
    }
}
