package ru.inno.course.homework2;

class Item {

    String name;
    int vendorCode;
    int price; //Необязательный параметр
    int numOfItems;
    String madeCountry;
    String category;
    String color;
    String brand; //Необязательный параметр

    public Item(String name, int vendorCode, int price, int numOfItems, String madeCountry, String category, String color, String brand) {
        this.name = name;
        this.vendorCode = vendorCode;
        this.price = price;
        this.numOfItems = numOfItems;
        this.madeCountry = madeCountry;
        this.category = category;
        this.color = color;
        this.brand = brand;
    }

    public Item(String name, int vendorCode, int numOfItems, String madeCountry, String category, String color) {
        this.name = name;
        this.vendorCode = vendorCode;
        this.numOfItems = numOfItems;
        this.madeCountry = madeCountry;
        this.category = category;
        this.color = color;
    }
}

public class Task3 {

    public static void main(String[] args) {

        Item[] items = new Item[5];
        items[0] = new Item("IPhone 8", 14235987, 40000, 12,	"США", "смартфоны", "Серый","Apple");
        items[1] = new Item("Galaxy S10", 23093424, 38000, 14, "Китай", "смартфоны", "Белый","Samsung");
        items[2] = new Item("Ditto X2", 96400084, 2, "Дания", "гитарные аксессуары", null);
        items[3] = new Item("Mooer Groove Loop X2", 94220576, 1, "Китай", "гитарные аксессуары", "Серый");
        items[4] = new Item("Belcat POP15A", 57890412, 12000, 2, "Китай", "гитарные аксессуары", "Чёрный", "Belcat");

        for(Item nextItem : items) {
            System.out.println("\nАртикул: " + nextItem.vendorCode + "; Название: " + nextItem.name + "; Цена: " + nextItem.price + "; Кол-во: " + nextItem.numOfItems + "; Страна-изготовитель: " + nextItem.madeCountry + "; Цвет: " + nextItem.color);
        }
    }
}