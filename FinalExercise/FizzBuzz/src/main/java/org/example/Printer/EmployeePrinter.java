package org.example.Printer;

import org.example.Model.Employee;
import org.example.Repository.EmployeeReporter;
import org.example.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class EmployeePrinter implements EmployeeReporter {
    @Autowired
    EmployeeService employeeService;

    @Override
    public ResponseEntity<Employee> report(int age) {
        List<Employee> employeesThatEarningMoreThan = employeeService.getAllEmployeesThatAreEarningMoreThan(100000d);

        System.out.println("Here are the employees that earning more than 100k");
        employeesThatEarningMoreThan.forEach(e -> System.out.println(e.toString()));

        List<Employee> employeesExceedingAge = employeeService.getAllEmployeesExceedingAge(30);

        System.out.println("Here are the employees exceeding age");
        employeesExceedingAge.forEach(e -> System.out.println(e.toString()));

        List<Employee> employeesWithMatchingPosition = employeeService.getAllEmployeesWithMatchingPosition("Cognizant Softvision");

        System.out.println("Here are the employees with matching Position");
        employeesWithMatchingPosition.forEach(e -> System.out.println(e.toString()));

        List<Employee> employeesWithHighestSalary = employeeService.getEmployeeWithHighestSalary();

        System.out.println("Here are the employees with highest salary");
        employeesWithHighestSalary.forEach(e -> System.out.println(e.toString()));
         return null;
    }
}
