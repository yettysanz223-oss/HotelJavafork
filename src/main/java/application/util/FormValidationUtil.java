package application.util;

import java.util.Scanner;

public class FormValidationUtil {

    static Scanner sc = new Scanner(System.in);

    public static int validateInt(String prompt){

        while(true){

            try{

                System.out.println(prompt);
                int value = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer
                return value;

            }catch (Exception e){
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                sc.nextLine(); // Limpiar el buffer
            }
        }

    }





}
