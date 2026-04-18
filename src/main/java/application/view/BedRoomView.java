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



}
