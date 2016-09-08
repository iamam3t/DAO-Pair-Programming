/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.pairprogramming.util;

import com.leapfrog.pairprogramming.controller.DepartmentController;
import com.leapfrog.pairprogramming.controller.EmployeeController;
import com.leapfrog.pairprogramming.DAOImpl.DepartmentDAOImpl;
import com.leapfrog.pairprogramming.DAOImpl.EmployeeDAOImpl;
import java.util.Scanner;

/**
 *
 * @author AM3ET
 */
public class MainMenu {
    
    public void MainMenu(){
        Scanner input = new Scanner(System.in);
        DepartmentController depCtrl = new DepartmentController(new DepartmentDAOImpl(),new Scanner(System.in));
        EmployeeController empCtrl = new EmployeeController(new EmployeeDAOImpl(),new Scanner(System.in));
        while (true) {
            System.out.println("");
            System.out.println("1. Department Record");
            System.out.println("2. Employee Record");
            System.out.println("3. Exit");
            System.out.println("Enter your choice [1-3]:");
            switch(input.nextInt()){
                case 1:
                    depCtrl.process();
                    break;
                case 2:
                    empCtrl.process();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
    
    
}
