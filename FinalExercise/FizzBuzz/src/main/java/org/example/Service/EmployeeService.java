package org.example.Service;
import org.example.Model.Employee;
import org.example.Repository.EmployeeRepoFromCsv;
import org.example.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployeesThatAreEarningMoreThan(Double amount) {
        return employeeRepository.getAllEmployees().stream().filter(employee -> employee.getSalary() > amount)
                .collect(Collectors.toList());
    }

    public List<Employee> getAllEmployeesExceedingAge(int age) {
        return employeeRepository.getAllEmployees().stream().filter(employee -> employee.getAge() > age)
                .collect(Collectors.toList());
    }

    public List<Employee> getAllEmployeesWithMatchingPosition(String position) {
        return employeeRepository.getAllEmployees().stream().filter(employee -> employee.getPosition().equals(position))
                .collect(Collectors.toList());
    }

    public List<Employee> getEmployeeWithHighestSalary() {
        Double maxSalary = employeeRepository.getAllEmployees().stream()
                .map(Employee::getSalary)
                .max(Double::compare).get();
        return employeeRepository.getAllEmployees().stream().filter(employee -> employee.getSalary() == maxSalary)
                .collect(Collectors.toList());
    }

    public List<Employee> getAllEmployee() {
        return employeeRepository.getAllEmployees()
                .stream().toList();
    }
}
