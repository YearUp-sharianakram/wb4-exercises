package com.pluralsight;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
//    private boolean currentlyWorking = false;
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
        return (getRegularHours() * payRate) + (getOvertimeHours() * (payRate * 1.5));
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

    public void punchIn(double time){
//        currentlyWorking = true;
        this.recentPunchIn = time;
    }

    public void punchOut(double time){
        double shiftHours = time - this.recentPunchIn;
        this.hoursWorked += shiftHours;
        this.recentPunchIn = 0.0;
    }

    public void punchTimeCard(double startTime, double endTime){
        this.hoursWorked += (endTime - startTime);

    }
}
