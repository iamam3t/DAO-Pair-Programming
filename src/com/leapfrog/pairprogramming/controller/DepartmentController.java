package com.leapfrog.pairprogramming.controller;

import com.leapfrog.pairprogramming.util.MainMenu;
import com.leapfrog.pairprogramming.DAO.DepartmentDAO;
import com.leapfrog.pairprogramming.entity.Department;
import java.util.Scanner;

public class DepartmentController {

    private DepartmentDAO depDAO;
    private Scanner input;

    public DepartmentController(DepartmentDAO depDAO, Scanner input) {
        this.depDAO = depDAO;
        this.input = input;
    }

    public void add() {

        while (true) {
            Department dep = new Department();
            System.out.println("");
            System.out.println("Enter the Department Record");
            System.out.println("");
            System.out.println("Enter Department ID: ");
            dep.setId(input.nextInt());
            System.out.println("Enter Department Name: ");
            dep.setDepName(input.next());
            System.out.println("Enter Department Email: ");
            dep.setEmail(input.next());
            System.out.println("Enter Department Contact No: ");
            dep.setContactNo(input.next());
            System.out.println("Enter total number of Employee of Department: ");
            dep.setTotalEmployee(input.nextInt());
            depDAO.insert(dep);
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
        System.out.println("List of Department:");
        System.out.println("ID " + " \t  " + "Name" + "  \t " + "Email" + " \t\t  " + "Contact" + " \t " + "No of Employee");
        depDAO.getAll().forEach(d -> {
            System.out.println(d.getId() + " \t   " + d.getDepName() + "  \t " + d.getEmail() + "  \t " + d.getContactNo() + " \t  " + d.getTotalEmployee());
        });
        System.out.println("");
        process();
    }

    public void delete() {
        System.out.println("");
        System.out.print("Enter Department Name to delete:");
        depDAO.getByName(input.next());
        System.out.println("");
        showAll();
        System.out.println("");
        process();
    }

    public void search() {
        System.out.println("");
        System.out.print("Enter Department Name to search:");
        String name = input.next();
        Department d = depDAO.search(name);

        System.out.println("ID " + " \t  " + "Name" + "  \t " + "Email" + " \t  " + "Contact" + " \t " + "No of Employee");
        //depDAO.getAll().forEach(d -> {
        //    if (d.getDepName().equals(name)) {
                //System.out.println(d.getId() + " \t   " + d.getDepName() + "  \t " + d.getEmail() + "  \t " + d.getContactNo() + " \t  " + d.getTotalEmployee());
        //}
        //});
        if (d != null) {
            System.out.println(d.getId() + " \t   " + d.getDepName() + "  \t " + d.getEmail() + "  \t " + d.getContactNo() + " \t  " + d.getTotalEmployee());

        }
        process();
    }

    public void depMenu() {

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
        depMenu();
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
