package application.domain;

import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in);

    private int serviceId;
    private String name;
    private String description;
    private double price;
    private boolean state;

    // Constructors

    public Service(){}

    public Service(int serviceId, String name, String description, double price, boolean state){
        this.serviceId = serviceId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.state = state;
    }

    public Service(String name){
        this.name = name;
    }

    // Getters and Setters

    public int getServiceId(){
        return serviceId;
    }

    public void setServiceId(int serviceId){
        this.serviceId = serviceId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public boolean isState(){
        return state;
    }

    public void setState(boolean state){
        this.state = state;
    }

    // Methods

    public Service createService(Service service){

        System.out.println("Ingrese id del servicio");
        int id = sc.nextInt();
        service.serviceId = id;
        sc.nextLine();

        System.out.println("Ingrese nombre del servicio");
        String name = sc.nextLine();
        service.name = name;

        System.out.println("Ingrese descripción del servicio");
        String description = sc.nextLine();
        service.description = description;

        System.out.println("Ingrese precio del servicio");
        double price = sc.nextDouble();
        service.price = price;

        System.out.println("Estado del servicio (true/false)");
        boolean state = sc.nextBoolean();
        service.state = state;

        return service;
    }

    public void getServiceById(int id, Service service){

        if(this.serviceId == id){

            System.out.println("Id: " + service.serviceId);
            System.out.println("Nombre: " + service.name);
            System.out.println("Descripción: " + service.description);
            System.out.println("Precio: " + service.price);
            System.out.println("Estado: " + service.state);

        }else{
            System.out.println("Servicio no encontrado");
        }

    }

}