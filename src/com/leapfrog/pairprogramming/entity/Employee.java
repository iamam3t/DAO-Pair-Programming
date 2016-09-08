package com.leapfrog.pairprogramming.entity;

public class Employee {
    private int id;
    private String firstName,lastName, email, contactNo,emp_Department;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, String email, String contactNo, String emp_Department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contactNo = contactNo;
        this.emp_Department = emp_Department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmp_Department() {
        return emp_Department;
    }

    public void setEmp_Department(String emp_Department) {
        this.emp_Department = emp_Department;
    }
    
    public String getFullname(){
        return firstName+" "+lastName;
    }
}
