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

    public void checkIn() {
        if (!this.occupied && !this.dirty) {
            this.occupied = true;
            this.dirty = true;
        } else {
            if (occupied) {
                System.out.println("Unable to check in, room is occupied");
            } else {
                System.out.println("Unable to check in, room is dirty");
            }
        }
    }
    public void checkout(){
        if (this.occupied && this.dirty){
            this.occupied = false;
        }else{
            System.out.println("Unable to check out, This room is available ");
        }
    }

    public void cleanRoom() {
        if (!this.occupied && this.dirty) {
            this.dirty = false;
        } else {
            if (occupied) {
                System.out.println("Room is currently in use");
            } else {
                System.out.println("Room is already clean");
            }
        }
    }

}