package com.joshenglish;

public class House {
    private Room room;

    public House(Room room) {
        this.room = room;
    }

    public Room getRoom() {
        return room;
    }

    public void printRoomDetails() {
        room.printDetails();
    }
}
