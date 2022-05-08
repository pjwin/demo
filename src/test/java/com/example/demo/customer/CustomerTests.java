package com.example.demo.customer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CustomerController.class)
@AutoConfigureMockMvc
class CustomerTests {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private CustomerRepository customerRepository;

    private ObjectMapper om = new ObjectMapper();

    @Test
    public void postCustomer() throws Exception {
        mvc.perform(MockMvcRequestBuilders
                        .post("/customers")
                        .content(om.writeValueAsString(new Customer("Company Name")))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated());
    }
}