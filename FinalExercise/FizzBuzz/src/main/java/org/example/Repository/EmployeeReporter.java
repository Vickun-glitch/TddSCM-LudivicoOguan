package org.example.Repository;

import org.example.Model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

public interface EmployeeReporter {
    ResponseEntity<Employee> report (@RequestParam int age);
}
