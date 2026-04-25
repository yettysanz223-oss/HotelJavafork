package application.view;

import application.domain.BedRoomType;
import application.service.outputs.BedRoomTypeService; // Asegúrate de importar el servicio
import java.util.Scanner;

public class BedRoomTypeView {

    Scanner sc = new Scanner(System.in);
    private final BedRoomType bedRoomType;
    private final BedRoomTypeService bedRoomTypeService; // 1. Agregamos el servicio

    // 2. Modificamos el constructor para recibir el servicio
    public BedRoomTypeView(BedRoomTypeService bedRoomTypeService, BedRoomType bedRoomType){
        this.bedRoomTypeService = bedRoomTypeService;
        this.bedRoomType = bedRoomType;
    }

    public void createBedRoomTypeView() {
        System.out.println("Creating a new bedroom type...");
        System.out.println("Ingrese el id del tipo de habitación:");
        int idType = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el nombre del tipo de habitación:");
        String nameType = sc.nextLine();

        // 3. Creamos una instancia nueva con los datos y se la pasamos al servicio
        BedRoomType newType = new BedRoomType(idType, nameType);
        bedRoomTypeService.createBedRoomType(newType);

        System.out.println("Tipo de habitación creado exitosamente.");
    }
}