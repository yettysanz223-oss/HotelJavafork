package application.view;

import application.domain.Employee;
import application.service.outputs.EmployeeService;

import java.util.Scanner;

public class EmployeeView {

    private final EmployeeService employeeService;
    private final Employee employee;
    private final Scanner sc = new Scanner(System.in);

    public EmployeeView(EmployeeService employeeService, Employee employee) {
        this.employeeService = employeeService;
        this.employee = employee;
    }

    public void menu() {

        int option;

        do {
            System.out.println("\n--- MENU EMPLEADOS ---");
            System.out.println("1. Crear");
            System.out.println("2. Listar");
            System.out.println("3. Buscar por ID");
            System.out.println("4. Actualizar");
            System.out.println("5. Eliminar");
            System.out.println("0. Salir");

            option = sc.nextInt();

            switch (option) {

                case 1:
                    employeeService.createEmployee(employee);
                    break;

                case 2:
                    employeeService.getAllEmployees();
                    break;

                case 3:
                    System.out.println("Ingrese ID:");
                    Employee emp = employeeService.getEmployeeById(sc.nextInt());
                    if (emp != null) {
                        System.out.println(emp);
                    } else {
                        System.out.println("No encontrado");
                    }
                    break;

                case 4:
                    System.out.println("ID:");
                    employee.setId(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Nombre:");
                    employee.setName(sc.nextLine());

                    System.out.println("Apellido:");
                    employee.setLastName(sc.nextLine());

                    System.out.println("Cargo:");
                    employee.setPosition(sc.nextLine());

                    System.out.println("Salario:");
                    employee.setSalary(sc.nextDouble());

                    employeeService.updateEmployee(employee);
                    break;

                case 5:
                    System.out.println("ID:");
                    employeeService.deleteEmployeeById(sc.nextInt());
                    break;
            }

        } while (option != 0);
    }
}