package com.leapfrog.pairprogramming.DAOImpl;

import com.leapfrog.pairprogramming.DAO.DepartmentDAO;
import com.leapfrog.pairprogramming.entity.Department;
import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class DepartmentDAOImpl implements DepartmentDAO {

    List<Department> dptList = new ArrayList<>();

    @Override
    public boolean insert(Department d) {
        return dptList.add(d);
    }

    @Override
    public List<Department> getAll() {
        return dptList;
    }

    @Override
    public boolean getByName(String name) {
        for (Department d : dptList) {
            if (d.getDepName().equals(name)) {
                return dptList.remove(d);
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
    public Department search(String name) {
        for(Department d: dptList){
            if(d.getDepName().equals(name)){
                return d;
            }
        }
        return null;
    }
}

