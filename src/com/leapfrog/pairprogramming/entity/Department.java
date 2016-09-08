package com.leapfrog.pairprogramming.entity;

public class Department {
    private int id,totalEmployee;
    private String depName, email, contactNo;

    public Department() {
    }

    public Department(int id, int totalEmployee, String depName, String email, String contactNo) {
        this.id = id;
        this.totalEmployee = totalEmployee;
        this.depName = depName;
        this.email = email;
        this.contactNo = contactNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalEmployee() {
        return totalEmployee;
    }

    public void setTotalEmployee(int totalEmployee) {
        this.totalEmployee = totalEmployee;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
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
}
