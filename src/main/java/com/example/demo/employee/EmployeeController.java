package com.example.demo.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/employee")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Employee %s!", name);
    }
}
