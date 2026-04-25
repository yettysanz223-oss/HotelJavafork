package application.service.outputs;

import application.domain.Employee;
import java.util.List;

public interface EmployeeService {

    Employee createEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    Employee getEmployeeById(int id);
    List<Employee> getAllEmployees();
    void deleteEmployeeById(int id);
}