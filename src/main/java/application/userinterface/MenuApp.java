package application.userinterface;

import application.view.BedRoomTypeView;
import application.view.BedRoomView;
import application.view.EmployeeView;
import application.view.GuestView;
import java.util.Scanner;

public class MenuApp {

    private final GuestView guestView;
    private final BedRoomView bedRoomView;
    private final EmployeeView employeeView;
    private final BedRoomTypeView bedRoomTypeView;
    private final Scanner sc = new Scanner(System.in);

    // Constructor que recibe los 4 componentes
    public MenuApp(GuestView g, BedRoomView b, EmployeeView e, BedRoomTypeView bt) {
        this.guestView = g;
        this.bedRoomView = b;
        this.employeeView = e;
        this.bedRoomTypeView = bt;
    }

    public void showMainMenu() {
        int option;
        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Huespedes");
            System.out.println("2. Habitaciones");
            System.out.println("3. Empleados");
            System.out.println("4. Gestionar Tipos de Habitación");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    // Lógica huéspedes
                    break;
                case 2:
                    // Lógica habitaciones
                    break;
                case 3:
                    // Lógica empleados
                    break;
                case 4:
                    System.out.println("Entrando a Gestionar Tipos de Habitación..."); // <--- AÑADE ESTO
                    bedRoomTypeView.createBedRoomTypeView();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (option != 0);
    }
}