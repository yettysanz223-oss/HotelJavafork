package application.domain;

public class Guest extends Person {

    private String origin;
    private String guestType;

    public Guest() {
        super();
    }

    public Guest(int id, String name, String lastName, String email, String password, Boolean state, String origin, String guestType) {
        super(id, name, lastName, email, password, state);
        this.origin = origin;
        this.guestType = guestType;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "origin='" + origin + '\'' +
                ", guestType='" + guestType + '\'' +
                "} " + super.toString();
    }

    public Guest createGuest(Guest guest){

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Ingrese el id del huésped");
        guest.setId(sc.nextInt());
        sc.nextLine();

        System.out.println("Ingrese el nombre");
        guest.setName(sc.nextLine());

        System.out.println("Ingrese el apellido");
        guest.setLastName(sc.nextLine());

        System.out.println("Ingrese el correo");
        guest.setEmail(sc.nextLine());

        System.out.println("Ingrese la contraseña");
        guest.setPassword(sc.nextLine());

        System.out.println("Ingrese el origen");
        guest.setOrigin(sc.nextLine());

        System.out.println("Ingrese el tipo de huésped");
        guest.setGuestType(sc.nextLine());

        System.out.println("Estado (true/false)");
        guest.setState(sc.nextBoolean());

        return guest;
    }
}
