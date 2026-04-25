package application.service.outputs;

import application.domain.BedRoomType;
import java.util.List;

public interface BedRoomTypeService {
    BedRoomType createBedRoomType(BedRoomType type);
    BedRoomType updateBedRoomType(int id, BedRoomType type);
    BedRoomType getBedRoomTypeById(int id);
    List<BedRoomType> getAllBedRoomTypes();
    void deleteBedRoomTypeById(int id);
}
