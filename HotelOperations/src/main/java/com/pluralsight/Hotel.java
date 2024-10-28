package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        int bookedSuites = 0;
        int bookedBasicRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        int availableRooms;
        if (isSuite) {
            availableRooms = this.numberOfSuites - this.bookedSuites;
        } else {
            availableRooms = this.numberOfRooms - this.bookedBasicRooms;
        }
        if (numberOfRooms <= availableRooms){
            this.bookedBasicRooms += numberOfRooms;
            return true;
        }else{
            return false;
        }
    }
}




