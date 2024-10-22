package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Employee jack = new Employee(1,"Jack" , "cleaning", 10.0 , 0.0);


        jack.punchIn(1.5);
        jack.punchOut(3.0);
        System.out.println(jack.getHoursWorked());
        jack.punchTimeCard(11.25, 12.00);
        System.out.println(jack.getHoursWorked());

    }
}