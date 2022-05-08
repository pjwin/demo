//Customer Domain Object
//JPA Entity

package com.example.demo.customer;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "customer", schema = "public", catalog = "demo")
public class Customer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cust_id", nullable = false)
    private int custId;

    @Column(name = "cust_name", nullable = false)
    @NotNull
    private String custName;

    @Column(name = "addr1", length = 200)
    private String addr1;

    @Column(name = "city", length = 200)
    private String city;

    @Column(name = "state", length = 30)
    private String state;

    @Column(name = "zip", length = 10)
    private String zip;

    protected Customer() {
    }

    public Customer(String custName) {
        this.custName = custName;
    }

    public Customer(String custName, String addr1, String city, String state, String zip) {
        this.custName = custName;
        this.addr1 = addr1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", addr1='" + addr1 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return custId == customer.custId && custName.equals(customer.custName) && Objects.equals(addr1, customer.addr1) && Objects.equals(city, customer.city) && Objects.equals(state, customer.state) && Objects.equals(zip, customer.zip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(custId, custName, addr1, city, state, zip);
    }
}
