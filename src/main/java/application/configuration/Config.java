package application.configuration;

import application.domain.BedRoom;
import application.domain.Guest;
import application.domain.Employee;
import application.domain.BedRoomType;

import application.repository.BedRoomRepository;
import application.repository.GuestRepository;
import application.repository.EmployeeRepository;
import application.repository.BedRoomTypeRepository;

import application.service.BedRoomServiceImp;
import application.service.EmployeeServiceImpl;
import application.service.BedRoomTypeServiceImpl;
import application.service.GuestAdminServiceImpl;
import application.service.GuestServiceImpl;

import application.service.outputs.BedRoomService;
import application.service.outputs.GuestAdminService;
import application.service.outputs.GuestService;
import application.service.outputs.EmployeeService;
import application.service.outputs.BedRoomTypeService;

import application.service.ports.BedRoomRepositoryPort;
import application.service.ports.BedRoomTypeRepositoryPort;
import application.service.ports.EmployeeRepositoryPort;

import application.userinterface.MenuApp;
import application.view.BedRoomView;
import application.view.GuestView;
import application.view.EmployeeView;
import application.view.BedRoomTypeView;

public class Config {

    public static MenuApp createMenuApp(){

        // ===== GUEST =====
        Guest guest = new Guest();
        GuestRepository guestRepository = new GuestRepository();
        GuestService guestService = new GuestServiceImpl(guestRepository);
        GuestAdminService guestAdminService = new GuestAdminServiceImpl(guestRepository);
        GuestView guestView = new GuestView(guestService, guest, guestAdminService );

        // ===== BEDROOM =====
        BedRoom bedRoom = new BedRoom();
        BedRoomRepositoryPort bedRoomRepositoryPort = new BedRoomRepository();
        BedRoomService bedRoomService = new BedRoomServiceImp(bedRoomRepositoryPort);
        BedRoomView bedRoomView = new BedRoomView(bedRoomService, bedRoom);

        // ===== EMPLOYEE =====
        Employee employee = new Employee();
        EmployeeRepositoryPort employeeRepository = new EmployeeRepository();
        EmployeeService employeeService = new EmployeeServiceImpl(employeeRepository);
        EmployeeView employeeView = new EmployeeView(employeeService, employee);

        // ===== BEDROOM TYPE (NUEVO) =====
        BedRoomType bedRoomType = new BedRoomType();
        BedRoomTypeRepositoryPort bedRoomTypeRepo = new BedRoomTypeRepository();
        BedRoomTypeService bedRoomTypeService = new BedRoomTypeServiceImpl(bedRoomTypeRepo);
        BedRoomTypeView bedRoomTypeView = new BedRoomTypeView(bedRoomTypeService, bedRoomType);

        return new MenuApp(guestView, bedRoomView, employeeView, bedRoomTypeView);
    }
}