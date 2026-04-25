package application.repository;

import application.domain.Guest;
import application.service.ports.GuestRepositoryPort;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GuestRepository implements GuestRepositoryPort {

    List<Guest> guests = new ArrayList<>();

    @Override
    public Guest saveGuest(Guest guest) {

        guests.add(guest);
        return guest;
    }

    @Override
    public Guest updateGuest(int id, Guest guest) {

        for (int i = 0; i < guests.size(); i++) {

            if (guests.get(i).getId() == id) {

                guests.set(i, guest);
                System.out.println("Huésped actualizado correctamente");
                return guest;
            }
        }

        System.out.println("Huésped no encontrado");
        return null;
    }

    @Override
    public Optional<Guest> findGuestById(int id) {

        for (Guest guest : guests) {

            if (guest.getId() == id) {
                return Optional.of(guest);
            }
        }

        return Optional.empty();
    }

    @Override
    public List<Guest> findAllGuests() {

        for (Guest guest : guests) {
            System.out.println(guest.toString());
        }

        return guests;
    }

    @Override
    public void deleteGuestById(int id) {

        for (Guest guest : guests) {

            if (guest.getId() == id) {

                guests.remove(guest);
                System.out.println("Huésped eliminado correctamente");
                return;
            }
        }

        System.out.println("Huésped no encontrado");
    }
}