package com.example.demo.customer;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    Optional<Customer> findById(int id);

    List<Customer> findByCustName(String custName);
}
