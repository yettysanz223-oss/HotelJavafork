package application.domain;
import java.util.Scanner;

public class Guest {
    Scanner sc = new Scanner(System.in);


    // Guest Atributes

    private int guestId;
    private String name;
    private String lastName;
    private String document;
    private  String email;
    private  boolean state;

    // Constructors
    public Guest(){

    }
    public Guest(int guestId, String name, String lastname, String document, String email, boolean state){
        this.guestId = guestId;
        this.name = name;
        this.lastName = lastname;
        this.document = document;
        this.email = email;
        this.state =state;
    }
    public Guest(String name){this.name = name;}

    //getters and setters


    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    // methode

    public Guest createGuest(Guest guest){

        System.out.println("Ingrese el id del huesped");
        guest.guestId= sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el nombre del huésped");
        guest.name = sc.nextLine();

        System.out.println("Ingrese el apellido del huésped");
        guest.lastName = sc.nextLine();

        System.out.println("Ingrese el número de documento");
        guest.document = sc.nextLine();

        System.out.println("Ingrese el correo electrónico");
        guest.email = sc.nextLine();

        System.out.println("Seleccione el estado del huésped");
        guest.state = sc.nextBoolean();

        return guest;
    }

    public void getGuestById(int id, Guest guest) {

        if (this.guestId == id) {
            System.out.println("Id: " + guest.guestId + "\n" +
                    "Nombre: " + guest.name + "\n" +
                    "Apellido: " + guest.lastName + "\n" +
                    "Documento: " + guest.document + "\n" +
                    "Email: " + guest.email + "\n" +
                    "Estado: " + guest.state + "\n");
        } else {
            System.out.println("Valide el id del huésped que está consultando");
        }
    }
}









