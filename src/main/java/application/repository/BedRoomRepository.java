package application.repository;

import application.domain.BedRoom;
import application.domain.BedRoomType;
import application.domain.enums.BedRoomEnums;
import application.service.ports.BedRoomRepositoryPort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class BedRoomRepository implements BedRoomRepositoryPort {


    List<BedRoom> bedRooms = new ArrayList<>(
            Arrays.asList(
                    new BedRoom(1, "201", BedRoomEnums.INDIVIDUAL.getDescription(), new BedRoomType(1,"Indivual"),120000, true ),
                    new BedRoom(2, "202", BedRoomEnums.DOBLE.getDescription(), new BedRoomType(1,"Doble"),180000, true ),
                    new BedRoom(3, "203", BedRoomEnums.SUITE.getDescription(), new BedRoomType(1,"Suite"),240000, true )
            )

    );

    public BedRoom saveBedRoom(BedRoom bedRoom){

        bedRooms.add(bedRoom);

        return bedRoom;

    }

    @Override
    public BedRoom updateBedRoom(int id, BedRoom bedRoom) {

        for (int i = 0; i < bedRooms.size(); i++) {

            if (bedRooms.get(i).getRoomId() == id) {

                bedRooms.set(i, bedRoom);

                System.out.println("Habitación actualizada correctamente");

                return bedRoom;
            }
        }

        System.out.println("Habitación no encontrada");
        return null;
    }

    @Override
    public Optional<BedRoom> findBedRoomById(int id) {

        for(BedRoom bedroom: bedRooms){
            if(bedroom.getRoomId() == id){
                return Optional.of(bedroom);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<BedRoom> findAllBedRooms() {

        for (BedRoom bedroom : bedRooms) {
            System.out.println(bedroom.getRoomId() + " " + bedroom.getRoom() + " " + bedroom.getRoomType() + " " + bedroom.getPrice() + " " + bedroom.isState());
        }
        return bedRooms;

    }

    @Override
    public void deleteBedRoomById(int id) {

        /**
        bedRooms.removeIf(bedroom -> bedroom.getRoomId() == id);
        System.out.println("Habitacion con id " + id + " ha sido eliminada.");
        for (BedRoom bedroom : bedRooms) {
            System.out.println(bedroom.getRoomId() + " " + bedroom.getRoom() + " " + bedroom.getRoomType() + " " + bedroom.getPrice() + " " + bedroom.isState());
        }**/

        for(BedRoom bedroom: bedRooms){
            if(bedroom.getRoomId() == id){
                bedRooms.remove(bedroom);
                System.out.println("Habitacion con id " + id + " ha sido eliminada.");
                for (BedRoom bedroom1 : bedRooms) {
                    System.out.println(bedroom1.getRoomId() + " " + bedroom1.getRoom() + " " + bedroom1.getRoomType() + " " + bedroom1.getPrice() + " " + bedroom1.isState());
                }
                return;
            }
        }
         System.out.println("Habitacion con id " + id + " no encontrada.");

    }
}
