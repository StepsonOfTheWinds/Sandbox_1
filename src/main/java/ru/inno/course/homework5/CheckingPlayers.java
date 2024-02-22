package ru.inno.course.homework5;

public class CheckingPlayers {

    public static void main(String[] args) {

        Player player1 = new Player(0,"AlexTheSuperTramp", true);
        Player player2 = new Player(0,"AlexRheSuperTramp", true);

        //boolean comparasionOne = player1 == player2;
        //System.out.println(comparasionOne);

        boolean comparasionTwo = player1.equals(player2);
        System.out.println(comparasionTwo);








    }
}
