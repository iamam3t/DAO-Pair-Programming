package com.leapfrog.pairprogramming.DAO;

import com.leapfrog.pairprogramming.entity.Department;
import java.util.List;


public interface DepartmentDAO {
    
    boolean insert(Department d);
    List<Department> getAll();
    boolean getByName(String name);
    Department search(String name);
}
