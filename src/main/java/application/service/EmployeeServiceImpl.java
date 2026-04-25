package application.service;

import application.domain.Employee;
import application.service.outputs.EmployeeService;
import application.service.ports.EmployeeRepositoryPort;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepositoryPort employeeRepositoryPort;

    public EmployeeServiceImpl(EmployeeRepositoryPort employeeRepositoryPort) {
        this.employeeRepositoryPort = employeeRepositoryPort;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        // Corregido: Llamamos al método del puerto, no al del dominio
        return employeeRepositoryPort.saveEmployee(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        int id = employee.getId();
        return employeeRepositoryPort.updateEmployee(id, employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeRepositoryPort.findEmployeeById(id)
                .orElse(null);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepositoryPort.findAllEmployees();
    }

    @Override
    public void deleteEmployeeById(int id) {
        employeeRepositoryPort.deleteEmployeeById(id);
    }
}