package com.pluralsight;

public class Reservation {


    private String roomType;

    private int numberOfNights;
    private boolean weekend;


    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }


    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() throws Exception {
        double price;
        if(this.getRoomType().equalsIgnoreCase("king")){
            price = 139;
        }
        else if (this.getRoomType().equalsIgnoreCase("double")){
            price = 129;
        }
        else{
            throw new Exception("Cannot compute price without correct room type (king or double)");
        }

        if(this.isWeekend()){
            price *= 1.1;
        }

        return  price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getReservationTotal() throws Exception {
        return this.getPrice() * this.getNumberOfNights();
    }

}