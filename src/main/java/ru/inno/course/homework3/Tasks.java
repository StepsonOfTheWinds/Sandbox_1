package ru.inno.course.homework3;

public class Tasks {

//    public static float turnStringToFloat(String s) {
//        return Float.parseFloat(s);
//    }

    public static void main(String[] args) {

        //Задание 1
        String[] todoList = new String[5];
        todoList[0] = "Умыться, побриться, почистить зубы и причесакться.";
        todoList[1] = "\nНе опоздать на работу";
        todoList[2] = "\nПоучить баянные партии к ближайшему выступлению группы";
        todoList[3] = "\nПозаниматься программированием на Java";
        todoList[4] = "\nПерепаять новый mini-jack-разъём у наушников";
        System.out.println(todoList[0] + todoList[1] + todoList[2] + todoList[3] + todoList[4]);

        //Задание 2
//        Так и не понял, почему не работает вот эта конструкция:
//        float[] fractionalNumbers = new float[3];
//        String preNumPi = String.format("%.5f", (float)Math.PI);
//        float numPi = turnStringToFloat(preNumPi);
//        Впрочем, пробовал и другие способы. Видимо, ещё мало понимания.
        String[] fractionalNumbers = new String[3];
        String numPi = String.format("%.5f", (float)Math.PI);
        fractionalNumbers[0] = numPi;
        String numE = String.format("%.5f", (float)Math.E);
        fractionalNumbers[1] = numE;
        String numOne = "1";
        fractionalNumbers[2] = numOne;
        System.out.println(fractionalNumbers[0] + " " + fractionalNumbers[1] + " " + fractionalNumbers[2]);

        //Задание 3
        Movie[] myFavoriteMovies;
        myFavoriteMovies = new Movie[3];
        myFavoriteMovies[0] = new Movie("Сад изящных слов", 10, "мелодрама", "Япония", false);
        myFavoriteMovies[1] = new Movie("Властелин колец", 10, "фэнтези", "США/Новая Зеландия", true);
        myFavoriteMovies[2] = new Movie("Баллада о солдате", 10, "драма", "СССР", false);
        System.out.println(myFavoriteMovies[0].manufacturerCountry + " " + myFavoriteMovies[1].genre + " " + myFavoriteMovies[2].title);

        //Задание 4
        int billion = 0;
        while (billion <= 999999999) {
            billion = billion+1;
            System.out.println(billion);
        }

        //Задание 5
        String[] yearOfRelease;
        yearOfRelease = new String[]{"2013г.", "2001г.", "1959г."};
        for (int m = 0; m < 3; m++) {
            System.out.println(yearOfRelease[m] + " " + myFavoriteMovies[m].title + ", " + myFavoriteMovies[m].genre + ", " + myFavoriteMovies[m].ratingFrom0To10);
        }

        //Задание 6
        String[] namesOfPlayers;
        namesOfPlayers = new String[]{"Amway921", "LeBwa", "NearYou", "EvilGranny", "TRISS", "KorbenDallas", "Vspishka", "Yusha", "Murazor", "Gabriel Ange1os"};
        for (int i = 0; i < 3; i++) {
            System.out.println(namesOfPlayers[i]);
        }
    }
}

class Movie {
    String title;
    int ratingFrom0To10;
    String genre;
    String manufacturerCountry;
    boolean isHaveTheOscar;
    public Movie(String title, int ratingFrom0To10, String genre, String manufacturerCountry, boolean isHaveTheOscar) {
        this.title = title;
        this.ratingFrom0To10 = ratingFrom0To10;
        this.genre = genre;
        this.manufacturerCountry = manufacturerCountry;
        this.isHaveTheOscar = isHaveTheOscar;
    }
}




