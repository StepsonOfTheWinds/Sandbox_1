package ru.inno.course.homework4;

public class Task7 {

    public static void main(String[] args) {

        int[] century = new int[100];

        for (int i = 0; i < 100; i++) {
            century[i] = i + 1;
            if (century[i] % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (century[i] % 5 == 0) {
                System.out.println("Buzz");
            }
            else if ((century[i] % 3 == 0) & (century[i] % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else System.out.println(century[i]);
        }
    }
}


