package application.service;

import application.domain.BedRoomType;
import application.service.outputs.BedRoomTypeService;
import application.service.ports.BedRoomTypeRepositoryPort;
import java.util.List;

public class BedRoomTypeServiceImpl implements BedRoomTypeService {

    private final BedRoomTypeRepositoryPort repository;

    public BedRoomTypeServiceImpl(BedRoomTypeRepositoryPort repository) {
        this.repository = repository;
    }

    @Override
    public BedRoomType createBedRoomType(BedRoomType type) {
        return repository.saveBedRoomType(type);
    }

    @Override
    public BedRoomType updateBedRoomType(int id, BedRoomType type) {
        return repository.updateBedRoomType(id, type);
    }

    @Override
    public BedRoomType getBedRoomTypeById(int id) {
        return repository.findBedRoomTypeById(id).orElse(null);
    }

    @Override
    public List<BedRoomType> getAllBedRoomTypes() {
        return repository.findAllBedRoomTypes();
    }

    @Override
    public void deleteBedRoomTypeById(int id) {
        repository.deleteBedRoomTypeById(id);
    }
}