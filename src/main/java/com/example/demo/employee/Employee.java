package com.example.demo.employee;

import javax.persistence.*;

@Entity
@Table(name = "employee", schema = "public", catalog = "demo")
public class Employee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "emp_id")
    private int empId;
    @Basic
    @Column(name = "first_name")
    private String firstName;
    @Basic
    @Column(name = "last_name")
    private String lastName;
    @Basic
    @Column(name = "photo_uri")
    private String photoUri;
    @Basic
    @Column(name = "cust_id")
    private Integer custId;

    protected Employee() {}

    public Employee(int empId, String firstName, String lastName, String photoUri, Integer custId) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.photoUri = photoUri;
        this.custId = custId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhotoUri() {
        return photoUri;
    }

    public void setPhotoUri(String photoUri) {
        this.photoUri = photoUri;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", photoUri='" + photoUri + '\'' +
                ", custId=" + custId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (empId != employee.empId) return false;
        if (firstName != null ? !firstName.equals(employee.firstName) : employee.firstName != null) return false;
        if (lastName != null ? !lastName.equals(employee.lastName) : employee.lastName != null) return false;
        if (photoUri != null ? !photoUri.equals(employee.photoUri) : employee.photoUri != null) return false;
        if (custId != null ? !custId.equals(employee.custId) : employee.custId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empId;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (photoUri != null ? photoUri.hashCode() : 0);
        result = 31 * result + (custId != null ? custId.hashCode() : 0);
        return result;
    }
}
