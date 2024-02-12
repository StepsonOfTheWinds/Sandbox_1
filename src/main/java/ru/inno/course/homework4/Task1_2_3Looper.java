package ru.inno.course.homework4;

public class Task1_2_3Looper {

    public static void main(String[] args) {

        //Задача 1
        int balance;
        int[] randomUtility = new int[11];
        balance = (int) (Math.random() * randomUtility.length);
        if(balance == 10) {
            System.out.println("Десятка");
        }

        //Задача 2
        int someVariable = (int) (Math.random() * randomUtility.length);
        int someVariableRemain = someVariable % 2;
        if (someVariableRemain == 0) {
            System.out.println("Чётное число");
        } else {
            System.out.println("Нечётное число");
        }

        //Задача 3
        int someNewVariableRemain = someVariable % 2;
        if (someNewVariableRemain == 0) {
            if(someVariable % 4 == 0) {
                System.out.println("Чётное число. Кратно четырём.");
            }
        } else {
            if(someVariable % 3 == 0) {
                System.out.println("Нечётное число. Кратно трём.");
            }
        }
    }

}
