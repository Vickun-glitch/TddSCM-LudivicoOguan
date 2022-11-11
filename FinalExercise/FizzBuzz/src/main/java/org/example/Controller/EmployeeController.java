package org.example.Controller;

import org.example.Model.Employee;
import org.example.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    public List<Employee> getEmployeeReturnValue(){
        return employeeService.getAllEmployee();
    }
}
