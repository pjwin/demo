package com.example.demo.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private static final Logger log = LoggerFactory.getLogger(CustomerController.class);

    private final CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Customer> find(@RequestParam(value = "name", required = false) String name) {
        if (name == null) return (List<Customer>) repository.findAll();
        log.info(String.format("Name query parameter = %s", name));
        return repository.findByCustName(name);
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable int id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Unable to find resource"));
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    Customer customer(@Valid @RequestBody Customer customer) {
        Customer customer2 = repository.save(customer);
        if (customer2 == null) throw new ResponseStatusException(BAD_REQUEST);
        return repository.save(customer);
    }

}
