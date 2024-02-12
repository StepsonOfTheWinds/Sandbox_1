package ru.inno.course.homework2;

class Flat {

    String number;
    int id;
    int price;
    int floor;
    int roomsNum;
    Room livingRoom;
    Room bedRoom;
    Room kitchenRoom;
    Room bathRoom;
    Room toiletRoom;
    Room hallWay;

    //Условно, в моём "строящемся доме" все квартиры будут состоять из 5 комнат и прихожей.
    //Но, если нужно, можно дописать блок кода, который позволит присваивать переменной roomsNum значение,
    //равное фактическому числу созданных объектов типа Room в объекте типа Flat.

    public Flat(String number, int id, int price, int floor, int roomsNum, Room room1, Room room2, Room room3, Room room4, Room room5, Room room6) {
        this.number = number;
        this.id = id;
        this.price = price;
        this.floor = floor;
        this.roomsNum = roomsNum;
        this.livingRoom = room1;
        this.bedRoom = room2;
        this.kitchenRoom = room3;
        this.bathRoom = room4;
        this.toiletRoom = room5;
        this.hallWay = room6;
    }
    void displayInfo() {
        System.out.println("Номер квартиры: " + this.number + "\nId квартиры: " + this.id + "\nЦена квартиры: " + this.price + "\nЭтаж: " + this.floor + "\nКол-во комнат: " + this.roomsNum);
        System.out.println("Помещение 1: " + this.livingRoom.name + "\nПомещение 2: " + this.bedRoom.name + "\nПомещение 3: " + this.kitchenRoom.name + "\nПомещение 4: " + this.bathRoom.name + "\nПомещение 5: " + this.toiletRoom.name + "\nПомещение 6: " + this.hallWay.name);
    }
}

class Room {

    String name;

    double length;
    double width;
    double height;

    byte windowsNum;
    byte doorsNum;

    boolean boilerPipe;
    boolean gasTube;
    boolean sewerage;
    boolean bathTub;
    boolean washBasin;
    boolean toilet;

    public Room(String name, double length, double width, double height, byte windowsNum, byte doorsNum, boolean boilerPipe) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.windowsNum = windowsNum;
        this.doorsNum = doorsNum;
        this.boilerPipe = boilerPipe;
        //конструктор для жилых комнат
    }

    public Room(String name, double length, double width, double height, byte windowsNum, byte doorsNum, boolean boilerPipe, boolean gasTube, boolean sewerage) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.windowsNum = windowsNum;
        this.doorsNum = doorsNum;
        this.boilerPipe = boilerPipe;
        this.gasTube = gasTube;
        this.sewerage = sewerage;
        //конструктор для кухни
    }

    public Room(String name, double length, double width, double height, byte doorsNum, boolean sewerage, boolean washBasin, boolean bathTub) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.doorsNum = doorsNum;
        this.sewerage = sewerage;
        this.washBasin = washBasin;
        this.bathTub = bathTub;
        //конструктор для ванной комнаты
    }

    public Room(String name, double length, double width, double height, byte doorsNum, boolean sewerage, boolean toilet) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.doorsNum = doorsNum;
        this.sewerage = sewerage;
        this.toilet = toilet;
        //конструктор для туалетной комнаты
    }
}

public class Task2 {

    public static void main(String[] args) {
        Room livingRoom = new Room("Гостиная", 6.0, 4.5, 2.5, (byte) 1, (byte) 2, true);
        Room bedRoom = new Room("Спальная", 4, 3.4, 2.5, (byte) 1, (byte) 1, true);
        Room kitchenRoom = new Room("Кухня", 3, 2.8, 2.5, (byte) 1, (byte) 1, true, true, true);
        Room bathRoom = new Room("Ванная", 2.3, 1.7, 2.5, (byte) 1, true, true, true);
        Room toiletRoom = new Room("Уборная",1.5, 1.2, 2.5, (byte) 1, true, true);
        Room hallWay = new Room("Коридор", 4, 1.4, 2.5, (byte) 0, (byte) 0, false);
        Flat myFlat = new Flat("52", 52, 8000000, 9, 6, livingRoom, bedRoom, kitchenRoom, bathRoom, toiletRoom, hallWay);
        myFlat.displayInfo();
    }
}
