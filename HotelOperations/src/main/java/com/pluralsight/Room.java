package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean occupied = false;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean dirty){
        this.numberOfBeds = numberOfBeds;
        this.price = price;
//        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return this.numberOfBeds;
    }

    public double getPrice(){
        return  this.price;
    }

    public boolean isDirty(){
        return this.dirty;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isAvailable() {
        return ( !this.isDirty() && !this.isOccupied() );
    }

    public void checkIn(){
        this.occupied = true;
        this.dirty = true;
    }
    public void checkout(){
        this.occupied = false;
    }

    public void cleanRoom(){
        this.dirty = false;
    }

}