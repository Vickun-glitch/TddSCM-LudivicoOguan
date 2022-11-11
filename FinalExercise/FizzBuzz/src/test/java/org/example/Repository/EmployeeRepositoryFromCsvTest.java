package org.example.Repository;

import org.example.Model.Employee;
import org.example.Repository.EmployeeRepoFromCsv;
import org.example.Repository.EmployeeRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeRepositoryFromCsvTest {
    @Test
    @DisplayName("Given a csv in datastore.csv" +
            "when employeeRepositoryFROMCSV is executed" +
            "THEN it should return valid Employee objects")

    public void positiveCase() {
        //Arrange
        EmployeeRepository employeeRepository = new EmployeeRepoFromCsv();
        //Act
        List<Employee> employeeFromCsv = employeeRepository.getAllEmployees();
        //Assert
        List<Employee> expectedEmployees = List.of(
                new Employee("employee1", 30, 20000d, "softwareengineer"),
                new Employee("employee2", 23, 200000d, "Teacher"),
                new Employee("employee3", 25, 2000000d, "softwareengineer")
        );
        assertEquals(expectedEmployees, employeeFromCsv);
    }
}
