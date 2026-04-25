package application.domain;

import java.util.Scanner;

public class Employee extends Person {

    private String position;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(int id, String name, String lastName, String email, String password, Boolean state,
                    String position, double salary) {
        super(id, name, lastName, email, password, state);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee createEmployee(Employee employee) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el id del empleado");
        employee.setId(sc.nextInt());
        sc.nextLine();

        System.out.println("Ingrese el nombre");
        employee.setName(sc.nextLine());

        System.out.println("Ingrese el apellido");
        employee.setLastName(sc.nextLine());

        System.out.println("Ingrese el email");
        employee.setEmail(sc.nextLine());

        System.out.println("Ingrese el password");
        employee.setPassword(sc.nextLine());

        System.out.println("Estado (true/false)");
        employee.setState(sc.nextBoolean());
        sc.nextLine();

        System.out.println("Cargo");
        employee.setPosition(sc.nextLine());

        System.out.println("Salario");
        employee.setSalary(sc.nextDouble());

        return employee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                "} " + super.toString();
    }
}