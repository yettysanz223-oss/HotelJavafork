package application.domain;

import java.util.Scanner;

public class Employee extends Person {

    Scanner sc = new Scanner(System.in);

    private int employeeId;
    private String role;
    private double salary;

    // Constructors

    public Employee(){}

    public Employee(int employeeId, String role, double salary){
        this.employeeId = employeeId;
        this.role = role;
        this.salary = salary;
    }

    // Getters and Setters

    public int getEmployeeId(){
        return employeeId;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public String getRole(){
        return role;
    }

    public void setRole(String role){
        this.role = role;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    // Methods

    public Employee createEmployee(Employee employee){

        System.out.println("Ingrese id del empleado");
        employee.employeeId = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese nombre");
        employee.setName(sc.nextLine());

        System.out.println("Ingrese apellido");
        employee.setLastName(sc.nextLine());

        System.out.println("Ingrese cargo");
        employee.role = sc.nextLine();

        System.out.println("Ingrese salario");
        employee.salary = sc.nextDouble();

        System.out.println("Estado del empleado (true/false)");
        employee.setState(sc.nextBoolean());

        return employee;
    }

    public void getEmployeeById(int id, Employee employee){

        if(this.employeeId == id){

            System.out.println("Id: " + employee.employeeId);
            System.out.println("Nombre: " + employee.getName());
            System.out.println("Apellido: " + employee.getLastName());
            System.out.println("Cargo: " + employee.role);
            System.out.println("Salario: " + employee.salary);
            System.out.println("Estado: " + employee.getState());

        }else{
            System.out.println("Empleado no encontrado");
        }

    }

}