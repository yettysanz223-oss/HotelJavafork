package application.domain;

import java.util.Scanner;

public class Booking {

    Scanner sc = new Scanner(System.in);

    private int bookingId;
    private String checkInDate;
    private String checkOutDate;
    private boolean state;

    // Constructors

    public Booking(){}

    public Booking(int bookingId, String checkInDate, String checkOutDate, boolean state){
        this.bookingId = bookingId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.state = state;
    }

    // Getters and Setters

    public int getBookingId(){
        return bookingId;
    }

    public void setBookingId(int bookingId){
        this.bookingId = bookingId;
    }

    public String getCheckInDate(){
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate){
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate(){
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate){
        this.checkOutDate = checkOutDate;
    }

    public boolean isState(){
        return state;
    }

    public void setState(boolean state){
        this.state = state;
    }

    // Methods

    public Booking createBooking(Booking booking){

        System.out.println("Ingrese el id de la reserva");
        int id = sc.nextInt();
        booking.bookingId = id;
        sc.nextLine();

        System.out.println("Ingrese fecha de entrada");
        String checkIn = sc.nextLine();
        booking.checkInDate = checkIn;

        System.out.println("Ingrese fecha de salida");
        String checkOut = sc.nextLine();
        booking.checkOutDate = checkOut;

        System.out.println("Estado de la reserva");
        boolean state = sc.nextBoolean();
        booking.state = state;

        return booking;
    }

    public void getBookingById(int id , Booking booking){

        if(this.bookingId == id){

            System.out.println("Id: " + booking.bookingId + "\n" +
                    "CheckIn: " + booking.checkInDate + "\n" +
                    "CheckOut: " + booking.checkOutDate + "\n" +
                    "Estado: " + booking.state + "\n");

        }else{
            System.out.println("Valide el id de la reserva que esta consultando");
        }

    }

}