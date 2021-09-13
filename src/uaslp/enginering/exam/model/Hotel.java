package uaslp.enginering.exam.model;

import uaslp.enginering.exam.model.Guest;
import uaslp.enginering.exam.model.Reservation;
import uaslp.enginering.exam.model.Room;

import java.util.ArrayList;
public class Hotel {
    private String name; //nombre del hotel

    private ArrayList<Reservation> reservations;


    public Hotel(String name) {
        this.name=name;
        reservations = new ArrayList<>();
        rooms=new ArrayList<>();////////////
    }



    public void reserveRoom(int roomNumber, Guest guest, String arrivalDate, int nights) {
        Reservation reservation = new Reservation();

        reservation.setRoomNumber(roomNumber);
        reservation.setArrivalDate(arrivalDate);
        reservation.setGuest(guest);
        reservation.setNights(nights);

        reservations.add(reservation);
    }



    public ArrayList<Reservation> getReservations() {

        return reservations;
    }




////////////////////
    public String getName() {
        return name;
    }
    private ArrayList<Room> rooms;
    public ArrayList<Room> getRooms() {

        return rooms;
    }

    public void addRoom(Room room) {
        room.getNumber();
        room.getBed();
        room.getStatus();
        rooms.add(room);
    }
}

