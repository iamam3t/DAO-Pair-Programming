package com.leapfrog.pairprogramming.DAO;

import com.leapfrog.pairprogramming.entity.Employee;
import java.util.List;


public interface EmployeeDAO {
    
    boolean insert(Employee e);
    List<Employee> getAll();
    boolean getByName(String name);
    Employee search(String name);
}
