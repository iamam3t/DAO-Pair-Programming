package com.leapfrog.pairprogramming.controller;

import com.leapfrog.pairprogramming.util.MainMenu;
import com.leapfrog.pairprogramming.entity.Employee;
import com.leapfrog.pairprogramming.DAO.EmployeeDAO;
import java.util.Scanner;

public class EmployeeController {

    private EmployeeDAO empDAO;
    private Scanner input;

    public EmployeeController(EmployeeDAO empDAO, Scanner input) {
        this.empDAO = empDAO;
        this.input = input;
    }

    public void add() {

        while (true) {
            Employee emp = new Employee();
            System.out.println("");
            System.out.println("Enter the Employee Record");
            System.out.println("");
            System.out.println("Enter Employee ID: ");
            emp.setId(input.nextInt());
            System.out.println("Enter First Name: ");
            emp.setFirstName(input.next());
            System.out.println("Enter Last Name: ");
            emp.setLastName(input.next());
            System.out.println("Enter Email ID: ");
            emp.setEmail(input.next());
            System.out.println("Enter Contact No: ");
            emp.setContactNo(input.next());
            System.out.println("Enter Department: ");
            emp.setEmp_Department(input.next());
            empDAO.insert(emp);
            System.out.println("Do you want to add more? [Y/N]");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }
        System.out.println("");
        process();
    }

    public void showAll() {
        System.out.println("");
        System.out.println("List of Employees:");
        System.out.println("ID " + " \t  " + "Name" + "  \t " + "Email" + " \t\t  " + "Contact" + " \t " + "Department");
        empDAO.getAll().forEach(e -> {
            System.out.println(e.getId() + " \t   " + e.getFullname() + "  \t " + e.getEmail() + "  \t " + e.getContactNo() + " \t  " + e.getEmp_Department());
        });
        System.out.println("");
        process();
    }

    public void delete() {
        System.out.println("");
        System.out.print("Enter Employee Name to delete:");
        empDAO.getByName(input.next());
        System.out.println("");
        showAll();
        System.out.println("");
        process();
    }

    public void search() {
        System.out.println("");
        System.out.print("Enter Employees Name to search:");
        String name = input.next();
        Employee e = empDAO.search(name);

        System.out.println("ID " + " \t  " + "Name" + "  \t " + "Email" + " \t\t  " + "Contact" + " \t " + "Department");
        //depDAO.getAll().forEach(d -> {
        //    if (d.getDepName().equals(name)) {
                //System.out.println(d.getId() + " \t   " + d.getDepName() + "  \t " + d.getEmail() + "  \t " + d.getContactNo() + " \t  " + d.getTotalEmployee());
        //}
        //});
        if (e != null) {
            System.out.println(e.getId() + " \t   " + e.getFullname() + "  \t " + e.getEmail() + "  \t " + e.getContactNo() + " \t  " + e.getEmp_Department());

        }
        process();
    }

    public void empMenu() {

        System.out.println("");
        System.out.println("1. Add Record");
        System.out.println("2. Show Record");
        System.out.println("3. Search Record");
        System.out.println("4. Delete Record");
        System.out.println("5. Goto Main Menu");
        System.out.println("");
        System.out.println("Enter your choice [1-5]:");

    }

    public void process() {
        empMenu();
        MainMenu menu = new MainMenu();
        switch (input.nextInt()) {
            case 1:
                add();
                break;
            case 2:
                showAll();
                break;
            case 3:
                search();
                break;
            case 4:
                delete();
                break;
            case 5:
                menu.MainMenu();
                break;

        }

    }
}
