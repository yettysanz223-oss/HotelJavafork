package application.view;

import application.domain.BedRoom;
import application.service.outputs.BedRoomService;

public class BedRoomView {

    private final BedRoomService bedRoomService;
    private final BedRoom bedRoom;


    public BedRoomView(BedRoomService bedRoomService , BedRoom bedRoom) {
        this.bedRoomService = bedRoomService;
        this.bedRoom = bedRoom;
    }

    public void createBedRoom() {
        System.out.println("Mostrando la habitación...");
        bedRoomService.createBedRoom(bedRoom);

    }

    public void getAllBedRooms() {
        System.out.println("Mostrando todas las habitaciones...");
        bedRoomService.getAllBedRooms();
    }

    public void getBedRoomById(int id) {

        BedRoom room = bedRoomService.getBedRoomById(id);

        if (room != null) {
            System.out.println("Habitación encontrada:");
            System.out.println(room.getRoom());
        } else {
            System.out.println("Habitación no encontrada");
        }
    }

    public void deleteBedRoom(int id) {

        bedRoomService.deleteBedRoomById(id);
    }



}
