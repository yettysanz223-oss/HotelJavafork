package application.service;

import application.domain.BedRoom;
import application.service.outputs.BedRoomService;
import application.service.ports.BedRoomRepositoryPort;
import application.util.FormValidationUtil;

import java.util.List;
import java.util.Scanner;

public class BedRoomServiceImp implements BedRoomService {



    private final BedRoomRepositoryPort bedRoomRepositoryPort;

    public BedRoomServiceImp(BedRoomRepositoryPort bedRoomRepositoryPort) {
        this.bedRoomRepositoryPort = bedRoomRepositoryPort;
    }


    @Override
    public BedRoom createBedRoom(BedRoom bedRoom) {


        String prompt = "Ingrese el numero de la habitacion";
        bedRoom.setRoomId(FormValidationUtil.validateInt(prompt));


        bedRoomRepositoryPort.saveBedRoom(bedRoom);




        return bedRoom;
    }

    @Override
    public BedRoom updateBedRoom(BedRoom bedRoom) {

        int id = bedRoom.getRoomId();

        bedRoomRepositoryPort.updateBedRoom(id, bedRoom);

        return bedRoom;
    }

    @Override
    public BedRoom getBedRoomById(int id) {

        return bedRoomRepositoryPort.findBedRoomById(id)
                .orElse(null);
    }

    @Override
    public List<BedRoom> getAllBedRooms() {

        return bedRoomRepositoryPort.findAllBedRooms();
    }

    @Override
    public void deleteBedRoomById(int id) {

        bedRoomRepositoryPort.deleteBedRoomById(id);
    }
}
