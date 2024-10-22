package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Employee jack = new Employee(1,"Jack" , "cleaning", 10.0 , 45);

        System.out.println(jack.getTotalPay());
    }
}