package com.leapfrog.pairprogramming.DAOImpl;

import com.leapfrog.pairprogramming.entity.Employee;
import com.leapfrog.pairprogramming.DAO.EmployeeDAO;
import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    List<Employee> dptList = new ArrayList<>();

    @Override
    public boolean insert(Employee d) {
        return dptList.add(d);
    }

    @Override
    public List<Employee> getAll() {
        return dptList;
    }

    @Override
    public boolean getByName(String name) {
        for (Employee e : dptList) {
            if (e.getFirstName().equals(name)) {
                return dptList.remove(e);
            }

            /*for (Iterator<Department> it = dptList.iterator(); it.hasNext();) {

            Department dpt = it.next();
            if (dpt.getDepName().equals(name)) {
                it.remove();
            }*/
        }
        return false;
    }

    @Override
    public Employee search(String name) {
        for(Employee e: dptList){
            if(e.getFirstName().equals(name)){
                return e;
            }
        }
        return null;
    }
}

