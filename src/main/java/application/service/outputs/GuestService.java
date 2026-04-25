package application.service.outputs;

import application.domain.Guest;
import java.util.List;

public interface GuestService {

    Guest createGuest(Guest guest);
    Guest updateGuest(Guest guest);
    Guest getGuestById(int id);
    List<Guest> getAllGuests();
    void deleteGuestById(int id);

}