package com.pluralsight;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked) {
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

    public int getHoursWorked() {
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

    public int getRegularHours(){
        return Math.min(hoursWorked, 40);
    }
    public int getOvertimeHours(){
        if (hoursWorked > 40){
            return (hoursWorked - 40);
        }else{
            return 0;
        }
    }

}
