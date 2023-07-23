package com.employee.dao;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.employee.model.Employee;


@Repository
public class EmployeeDAO {

    HashMap<Integer, Employee> employees=new HashMap();
    public void saveEmployee(Employee employee)
    {
        employees.put(employee.getId(), employee);
    }


    public List<Employee> getEmployeeDetails()
    {
        return new ArrayList<Employee>(employees.values());
    }

}