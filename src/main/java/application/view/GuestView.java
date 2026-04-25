package application.view;

import application.domain.Guest;
import application.service.outputs.GuestAdminService;
import application.service.outputs.GuestService;

public class GuestView {

    private final GuestService guestService;
    private final GuestAdminService guestAdminService;
    private final Guest guest;

    public GuestView(GuestService guestService, Guest guest , GuestAdminService guestAdminService) {
        this.guestAdminService = guestAdminService;
        this.guestService = guestService;
        this.guest = guest;
    }
    public void menu() {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int option;

        do {
            System.out.println("\n--- MENU HUESPEDES ---");
            System.out.println("1. Crear huésped");
            System.out.println("2. Listar huéspedes");
            System.out.println("3. Buscar por ID");
            System.out.println("4. Actualizar huésped");
            System.out.println("5. Eliminar huésped");
            System.out.println("0. Salir");

            option = sc.nextInt();

            switch (option) {

                case 1:
                    guestService.createGuest(guest);
                    break;

                case 2:
                    guestService.getAllGuests();
                    break;

                case 3:
                    System.out.println("ID:");
                    System.out.println(guestService.getGuestById(sc.nextInt()));
                    break;

                case 4:
                    System.out.println("ID:");
                    guest.setId(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Nombre:");
                    guest.setName(sc.nextLine());

                    System.out.println("Apellido:");
                    guest.setLastName(sc.nextLine());

                    System.out.println("Email:");
                    guest.setEmail(sc.nextLine());

                    System.out.println("Password:");
                    guest.setPassword(sc.nextLine());

                    System.out.println("Estado:");
                    guest.setState(sc.nextBoolean());
                    sc.nextLine();

                    System.out.println("Origen:");
                    guest.setOrigin(sc.nextLine());

                    System.out.println("Tipo:");
                    guest.setGuestType(sc.nextLine());

                    guestService.updateGuest(guest);
                    break;

                case 5:
                    System.out.println("ID:");
                    guestService.deleteGuestById(sc.nextInt());
                    break;
            }

        } while (option != 0);
    }

    public void createGuest(){


        guestService.createGuest(guest);

    }

    public void getAllGuests(){
        guestService.getAllGuests();
    }





}
