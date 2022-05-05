//Customer Domain Object
//JPA Entity

package com.example.demo.customer;

import javax.persistence.*;

@Entity
@Table(name = "customer", schema = "public", catalog = "demo")
public class Customer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cust_id")
    private int custId;

    @Basic
    @Column(name = "cust_name")
    private String custName;

    protected Customer() {}

    public Customer(String custName) {
        this.custName = custName;
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

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, custName='%s']",
                custId, custName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer that = (Customer) o;

        if (custId != that.custId) return false;
        if (custName != null ? !custName.equals(that.custName) : that.custName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = custId;
        result = 31 * result + (custName != null ? custName.hashCode() : 0);
        return result;
    }
}
