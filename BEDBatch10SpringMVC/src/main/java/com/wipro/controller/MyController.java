package com.wipro.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.dao.EmployeeDAO;
import com.wipro.model.Employee;

@Controller
public class MyController {

    @Autowired
    EmployeeDAO dao;

    @RequestMapping("/hello")
    public ModelAndView hello()
    {
        //business logic
        return new ModelAndView("welcomepage");

    }

    @RequestMapping("/getsysdate")
    public ModelAndView getsystemdate()
    {
        //business logic
        String todaysdatetime=new Date().toString();

        return new ModelAndView("displaydate","getdate",todaysdatetime);

    }

    @RequestMapping("/employeedetails")
    public ModelAndView returnEmployeepage()
    {
        return new ModelAndView("employeepage");
    }

    @RequestMapping(value="/saveemployee", method=RequestMethod.POST)
    public ModelAndView saveEmployee(@ModelAttribute Employee emp)
    {
        dao.saveEmployee(emp);
        return new ModelAndView("response","responsekey","Employee Information Updated");
    }

    @RequestMapping("/displayemployees")
    public ModelAndView getemployeeDetails()
    {
         List<Employee>employees=dao.getEmployeeDetails();


        return  new ModelAndView("displayemployeespage","employeekey",employees);

    }
}