package com.pluralsight;

public class Vehicle {
    private int vin;
    public int year;
    public String make;
    public String model;
    public String vehicleType;
    public String color;
    public int odometer;
    public double price;

    public Vehicle(int vin, int year, String make, String model, String vehicleType, String color, int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }

    public int getVin() {
        return vin;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }



    public String getModel() {
        return model;
    }



    public String getVehicleType() {
        return vehicleType;
    }


    public String getColor() {
        return color;
    }



    public int getOdometer() {
        return odometer;
    }


    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return (this.getYear() + " " + this.getMake() + " " + this.getModel() + " [" + this.getColor() + "]");
    }


}
