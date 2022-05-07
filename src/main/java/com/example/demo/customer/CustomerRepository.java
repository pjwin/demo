package com.example.demo.customer;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    Optional<Customer> findById(int id);

    List<Customer> findByCustName(String custName);
}
