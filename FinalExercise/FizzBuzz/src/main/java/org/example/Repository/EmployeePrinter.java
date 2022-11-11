package org.example.Repository;

import org.example.Model.Employee;
import org.example.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeePrinter implements EmployeeReporter{
    @Autowired
    EmployeeService employeeService;
    @Override
    public ResponseEntity<Employee> report (@RequestParam int age) {

       return null;
    }
}
