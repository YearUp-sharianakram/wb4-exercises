package com.pluralsight;





import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_should_occupied() {
        // arrange
        Room firstRoom = new Room(3,50.00, false);
        // act
        firstRoom.checkIn();

        // assert

        assertTrue(firstRoom.isOccupied());
    }

    @Test
    public void checkIn_should_dirty() {
        // arrange
        Room firstRoom = new Room(3,50.00, false);
        // act
        firstRoom.checkIn();

        // assert

        assertTrue(firstRoom.isDirty());
    }

    @Test
    public void checkIn_should_not_Available() {
        // arrange
        Room firstRoom = new Room(3,50.00, false);
        // act
        firstRoom.checkIn();

        // assert

        assertFalse(firstRoom.isAvailable());
    }

    @Test
    public void checkOut_should_notOccupied() {
        // arrange
        Room firstRoom = new Room(3,50.00, false);
        // act
        firstRoom.checkIn();
        firstRoom.checkout();

        // assert

        assertFalse(firstRoom.isOccupied());
    }

    @Test
    public void checkOut_should_dirty() {
        // arrange
        Room firstRoom = new Room(3,50.00, false);
        // act
        firstRoom.checkIn();
        firstRoom.checkout();

        // assert

        assertTrue(firstRoom.isDirty());
    }

    @Test
    public void checkOut_should_not_Available_dirty() {
        // arrange
        Room firstRoom = new Room(3,50.00, false);
        // act
        firstRoom.checkIn();
        firstRoom.checkout();

        // assert

        assertFalse(firstRoom.isAvailable());
    }

    @Test
    public void checkOut_when_dirty() {
        // arrange
        Room firstRoom = new Room(3,50.00, false);
        // act
        firstRoom.checkIn();
        firstRoom.checkout();
        firstRoom.checkout();

        // assert

        assertFalse(firstRoom.isOccupied());
        assertTrue(firstRoom.isDirty());
        assertFalse(firstRoom.isAvailable());
    }

    @Test
    public void checkOut_with_no_checkIn() {
        // arrange
        Room firstRoom = new Room(3,50.00, false);
        // act
        firstRoom.checkout();

        // assert

        assertFalse(firstRoom.isOccupied());
        assertFalse(firstRoom.isDirty());
        assertTrue(firstRoom.isAvailable());
    }

}