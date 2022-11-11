package org.example.Controller;

import org.example.Model.Employee;
import org.example.Service.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class EmployeeControllerTest {
Employee employee1 = new Employee("employee1", 30, 20000d, "softwareengineer");
Employee employee2 = new Employee("employee2", 23, 200000d, "Teacher");
Employee employee3 = new Employee("employee3", 25, 2000000d, "softwareengineer");
    @Mock
    private EmployeeService employeeService;
    @InjectMocks
    private EmployeeController employeeController;
    @BeforeEach
    public void setup() throws Exception {
        List<Employee> employees = List.of(employee1
                , employee2, employee3);
        Mockito.when(employeeService.getAllEmployee())
                .thenReturn(employees);
    }
    @Test
    @DisplayName("Given a request, " +
            "When employeeController is executed " +
            "Return the value of getAllEmployee")
    public void getEmployeeThenReturnValue() throws Exception {
        //arrange
        List<Employee> filteredEmployees = employeeController.getEmployeeReturnValue();
        //Assert
        assertThat(filteredEmployees).contains(employee1, employee2, employee3);
    }
}