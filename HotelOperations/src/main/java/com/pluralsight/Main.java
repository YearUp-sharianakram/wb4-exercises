package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Employee jack = new Employee(1,"Jack" , "cleaning", 10.0 , 0.0);
        Room firstRoom = new Room(3,50.00, false);



        jack.punchIn(9.0);
//        jack.punchOut(3.0);
        jack.punchOut();

        System.out.println(jack.getHoursWorked());
        System.out.println(jack.getTotalPay());
//        jack.punchTimeCard(11.25, 12.00);
//        System.out.println(jack.getHoursWorked());

//        firstRoom.cleanRoom();
//        firstRoom.checkIn();
//        firstRoom.checkout();
//        firstRoom.cleanRoom();
//        firstRoom.checkout();
//        firstRoom.checkIn();
    }
}