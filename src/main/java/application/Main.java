package application;

import application.domain.Person;
import application.domain.BedRoom;
import application.domain.Employee;
import application.domain.Service;
import application.domain.Guest;
import application.domain.Booking;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("jd@med.com");

        BedRoom bedRoom = new BedRoom();
        bedRoom.createBedRoom(bedRoom);
        bedRoom.getBedRoomById(bedRoom.getRoomId(), bedRoom);

        Service service = new Service();
        service.createService(service);
        service.getServiceById(service.getServiceId(), service);

        Guest guest = new Guest();
        guest.createGuest(guest);
        guest.getGuestById(guest.getGuestId(), guest);

        Employee employee = new Employee();
        employee.createEmployee(employee);
        employee.getEmployeeById(employee.getEmployeeId(), employee);

        Booking booking = new Booking();
        booking.createBooking(booking);
        booking.getBookingById(booking.getBookingId(), booking);

    }
}