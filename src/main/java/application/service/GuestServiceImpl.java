package application.service;

import application.domain.Guest;
import application.service.outputs.GuestService;
import application.service.ports.GuestRepositoryPort;

import java.util.List;
import java.util.Scanner;

public class GuestServiceImpl implements GuestService {

    private final GuestRepositoryPort guestRepositoryPort;
    Scanner sc = new Scanner(System.in);

    public GuestServiceImpl(GuestRepositoryPort guestRepositoryPort) {
        this.guestRepositoryPort = guestRepositoryPort;
    }

    @Override
    public Guest createGuest(Guest guest) {

        System.out.println("Ingrese el id del Huesped");
        guest.setId(sc.nextInt());
        sc.nextLine();

        System.out.println("Ingrese el nombre del Huesped");
        guest.setName(sc.nextLine());

        System.out.println("Ingrese el apellido");
        guest.setLastName(sc.nextLine());

        System.out.println("Ingrese el email");
        guest.setEmail(sc.nextLine());

        System.out.println("Ingrese el password");
        guest.setPassword(sc.nextLine());

        System.out.println("Estado Huesped (true/false)");
        guest.setState(sc.nextBoolean());
        sc.nextLine();

        System.out.println("Origen");
        guest.setOrigin(sc.nextLine());

        System.out.println("Tipo de Huesped");
        guest.setGuestType(sc.nextLine());

        guestRepositoryPort.saveGuest(guest);

        return guest;
    }

    @Override
    public Guest updateGuest(Guest guest) {

        int id = guest.getId();
        guestRepositoryPort.updateGuest(id, guest);

        return guest;
    }

    @Override
    public Guest getGuestById(int id) {

        return guestRepositoryPort.findGuestById(id)
                .orElse(null);
    }

    @Override
    public List<Guest> getAllGuests() {

        return guestRepositoryPort.findAllGuests();
    }

    @Override
    public void deleteGuestById(int id) {

        guestRepositoryPort.deleteGuestById(id);
    }
}