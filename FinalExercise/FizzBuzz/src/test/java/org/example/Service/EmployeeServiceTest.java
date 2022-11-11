package org.example.Service;
import org.example.Model.Employee;
import org.example.Repository.EmployeeRepository;
import org.example.Service.EmployeeService;
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
class EmployeeServiceTest {
    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeService employeeService;

    @Test
    @DisplayName("Given employees from repository with the set up above "+
    "when getAllEmployeesThatAreEarningMoreThan"+
    "Then result should return nameOfEmployee and nameOfEmployee2")

    public void testEmployeesThatAreEarningMoreThan() {
        //Arrange
        Employee employee1 = new Employee ( "name", 23,  20000d, "Engineer");
        Employee employee2 = new Employee ("name",23,  150000d, "Engineer");
        Employee employee3 = new Employee (  "name",23, 100000d, "Engineer");

        List<Employee> employees = List.of(employee1, employee2, employee3);
        Mockito.when(employeeRepository.getAllEmployees()).thenReturn(employees);
        //Act
        List<Employee> filteredEmployees = employeeService.getAllEmployeesThatAreEarningMoreThan( 90000d);
        //Assert
        assertThat(filteredEmployees).contains(employee2, employee3);
    }

    @Test
    @DisplayName("Given employees from repository with the set up above "+
            "when getAllEmployeesThatAreExceedingAge"+
            "Then result should return nameOfEmployee and nameOfEmployee2")
        public void getAllEmployeesExceedingAge() {
            //Arrange
        Employee employee1 = new Employee ( "name", 30,  20000d, "Engineer");
        Employee employee2 = new Employee ("name",23,  150000d, "Teacher");
        Employee employee3 = new Employee (  "name",23, 200000d, "Engineer");

        List<Employee> employees = List.of(employee1, employee2, employee3);
        Mockito.when(employeeRepository.getAllEmployees()).thenReturn(employees);
        //Act
        List<Employee> filteredEmployees = employeeService.getAllEmployeesExceedingAge(29);
        //Assert
        assertThat(filteredEmployees).contains(employee1);
        }
    @Test
    @DisplayName("Given employees from repository with the set up above "+
            "when getAllEmployeesThatAreExceedingAge"+
            "Then result should return nameOfEmployee and nameOfEmployee2")
    public void getAllEmployeesWithMatchingPosition () {
        //Arrange
        Employee employee1 = new Employee ( "name", 30,  20000d, "Engineer");
        Employee employee2 = new Employee ("name",23,  150000d, "Teacher");
        Employee employee3 = new Employee (  "name",23, 200000d, "Engineer");

        List<Employee> employees = List.of(employee1, employee2, employee3);
        Mockito.when(employeeRepository.getAllEmployees()).thenReturn(employees);
        //Act
        List<Employee> filteredEmployees = employeeService.getAllEmployeesWithMatchingPosition("Teacher");
        //Assert
        assertThat(filteredEmployees).contains(employee2);
    }
    @Test
    @DisplayName("Given employees from repository with the set up above "+
            "when getAllEmployeesWithHighestSalary"+
            "Then result should return nameOfEmployee and nameOfEmployee3")
    public void getEmployeeWithHighestSalary(){
        //Arrange
        Employee employee1 = new Employee ( "name", 30,  20000d, "Engineer");
        Employee employee2 = new Employee ("name",23,  150000d, "Teacher");
        Employee employee3 = new Employee (  "name",23, 200000d, "Engineer");

        List<Employee> employees = List.of(employee1, employee2, employee3);
        Mockito.when(employeeRepository.getAllEmployees()).thenReturn(employees);
        //Act
        List<Employee> filteredEmployees = employeeService.getEmployeeWithHighestSalary();
        //Assert
        assertThat(filteredEmployees).contains(employee3);
    }
}