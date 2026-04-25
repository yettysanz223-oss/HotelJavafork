package application.repository;

import application.domain.BedRoomType;
import application.service.ports.BedRoomTypeRepositoryPort; // <--- ¡Esta línea es la clave!
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BedRoomTypeRepository implements BedRoomTypeRepositoryPort {

    private List<BedRoomType> bedRoomTypes = new ArrayList<>();

    @Override
    public BedRoomType saveBedRoomType(BedRoomType bedRoomType) {
        bedRoomTypes.add(bedRoomType);
        return bedRoomType;
    }

    @Override
    public BedRoomType updateBedRoomType(int id, BedRoomType bedRoomType) {
        for (int i = 0; i < bedRoomTypes.size(); i++) {
            if (bedRoomTypes.get(i).getIdType() == id) {
                bedRoomTypes.set(i, bedRoomType);
                return bedRoomType;
            }
        }
        return null;
    }

    @Override
    public Optional<BedRoomType> findBedRoomTypeById(int id) {
        for (BedRoomType type : bedRoomTypes) {
            if (type.getIdType() == id) {
                return Optional.of(type);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<BedRoomType> findAllBedRoomTypes() {
        return bedRoomTypes;
    }

    @Override
    public void deleteBedRoomTypeById(int id) {
        bedRoomTypes.removeIf(type -> type.getIdType() == id);
    }
}