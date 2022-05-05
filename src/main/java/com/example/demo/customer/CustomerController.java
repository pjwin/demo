package com.example.demo.customer;

import com.example.demo.DemoApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    private static final Logger log = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private final CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/customer")
    public List<Customer> find(@RequestParam(value = "name", required = false) String name) {
        if (name == null) return (List<Customer>) repository.findAll();
        log.info(String.format("Name query parameter = %s", name));
        return repository.findByCustName(name);
    }
}
