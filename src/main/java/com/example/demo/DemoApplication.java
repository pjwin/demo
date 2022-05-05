package com.example.demo;

import com.example.demo.customer.Customer;
import com.example.demo.customer.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class DemoApplication {
    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Started Application");
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
        };
    }

//    @Bean
//    public CommandLineRunner demo(CustomerRepository repository) {
//        return (args) -> {
//            // save a few customers
//            repository.save(new Customer("ABC Co., Inc."));
//            repository.save(new Customer("Hooli"));
//            repository.save(new Customer("Pied Piper"));
//            repository.save(new Customer("Lumon Industries"));
//
//
//            // fetch all customers
//            log.info("Customers found with findAll():");
//            log.info("-------------------------------");
//            for (Customer customer : repository.findAll()) {
//                log.info(customer.toString());
//            }
//            log.info("");
//
//            // fetch an individual customer by ID
//            Customer customer = repository.findById(1);
//            log.info("Customer found with findById(1):");
//            log.info("--------------------------------");
//            log.info(customer.toString());
//            log.info("");
//
//            // fetch customers by last name
//            log.info("Customer found with findByCustName('Lumon Industries'):");
//            log.info("--------------------------------------------");
//            repository.findByCustName("Lumon Industries").forEach(cust -> {
//                log.info(cust.toString());
//            });
//            // for (Customer cust : repository.findByCustName("Lumon Industries")) {
//            //  log.info(cust.toString());
//            // }
//            log.info("");
//            repository.deleteAll();
//        };
//    }
}
