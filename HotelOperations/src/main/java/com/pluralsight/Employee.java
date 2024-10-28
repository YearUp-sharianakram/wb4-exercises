package com.pluralsight;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private boolean currentlyWorking = false;
    private double recentPunchIn = 0.0;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public double getTotalPay(){
        double totalPay =  (getRegularHours() * payRate) + (getOvertimeHours() * (payRate * 1.5));
        return roundDouble(totalPay,2);
    }

    public double getRegularHours(){
        return Math.min(hoursWorked, 40.0);
    }
    public double getOvertimeHours(){
        if (hoursWorked > 40){
            return (hoursWorked - 40);
        }else{
            return 0;
        }
    }


// only punch in if the recent Punch in Time is 0 or consider maybe adding another boolean for more readable code
    public void punchIn(double time) {
        if (!currentlyWorking) {
            currentlyWorking = true;
            this.recentPunchIn = time;
        } else {
            System.out.println("Unable to punch in, " + this.name + " is currently working");
        }
    }

    public void punchOut(double time) {
        if (currentlyWorking) {
            double shiftHours = time - this.recentPunchIn;
            this.hoursWorked += shiftHours;
            this.recentPunchIn = 0.0;
            this.currentlyWorking = false;
        } else {
            System.out.println("Unable to punch out, " + this.name + " is not currently working");

        }
    }
    public void punchTimeCard(double startTime, double endTime){
        this.hoursWorked += (endTime - startTime);

    }

    public double currentTimeToDecimal() {
        int punchInHour = LocalDateTime.now().getHour();
        int punchInMin = LocalDateTime.now().getMinute();
        double minToDecimal = (double) punchInMin / 60;
        return (punchInHour + minToDecimal);
    }

    public void punchIn(){
        if (!currentlyWorking) {
            currentlyWorking = true;
            recentPunchIn = currentTimeToDecimal();
        } else {
            System.out.println("Unable to punch in, " + this.name + " is currently working");
        }
    }

    public void punchOut(){
        if (currentlyWorking) {
            double timeOut = currentTimeToDecimal();
            double shiftHours = timeOut - recentPunchIn;

            this.hoursWorked += shiftHours;
            this.recentPunchIn = 0.0;
            this.currentlyWorking = false;
        } else {
            System.out.println("Unable to punch out, " + this.name + " is not currently working");

        }
    }

    private static double roundDouble(double input, int numberOfPlaces){
        double multiplier = Math.pow(10, numberOfPlaces);
        double output = Math.round( input * multiplier);
        output = output / multiplier;
        return output;
    }

}
