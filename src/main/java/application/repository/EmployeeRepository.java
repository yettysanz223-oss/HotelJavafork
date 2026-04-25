package application.repository;

import application.domain.Employee;
import application.service.ports.EmployeeRepositoryPort;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeRepository implements EmployeeRepositoryPort {

    List<Employee> employees = new ArrayList<>();

    @Override
    public Employee saveEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).getId() == id) {
                employees.set(i, employee);
                System.out.println("Empleado actualizado correctamente");
                return employee;
            }
        }

        System.out.println("Empleado no encontrado");
        return null;
    }

    @Override
    public Optional<Employee> findEmployeeById(int id) {

        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return Optional.of(emp);
            }
        }

        return Optional.empty();
    }

    @Override
    public List<Employee> findAllEmployees() {

        for (Employee emp : employees) {
            System.out.println(emp);
        }

        return employees;
    }

    @Override
    public void deleteEmployeeById(int id) {

        for (Employee emp : employees) {
            if (emp.getId() == id) {
                employees.remove(emp);
                System.out.println("Empleado eliminado");
                return;
            }
        }

        System.out.println("Empleado no encontrado");
    }
}