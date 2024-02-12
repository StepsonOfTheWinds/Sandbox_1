package ru.inno.course.homework2;

public class Task1 {

    String cardNumber;
    String firstPieceOfNum;
    String secondPieceOfNum;

    //Будем считать, что сеттер setCardNumber выполняет роль поля, заполняемого условным пользователем.
    void setCardNumber (String caNum) {
        this.cardNumber = caNum;
    }

    void hiding() {
        if (cardNumber.contains(" ")) {
            firstPieceOfNum = cardNumber.substring(0, 14);
            firstPieceOfNum = firstPieceOfNum.replaceAll("[0-9]", "*");
            secondPieceOfNum = cardNumber.substring(15, 19);
            System.out.println(firstPieceOfNum + " " + secondPieceOfNum);
        }
        if (cardNumber.length() == 16) {
            firstPieceOfNum = cardNumber.substring(0, 12);
            firstPieceOfNum = firstPieceOfNum.replaceAll("[0-9]", "*");
            secondPieceOfNum = cardNumber.substring(12, 16);
            System.out.println(firstPieceOfNum + secondPieceOfNum);
        }
        //В принципе, если покумекать, сюда можно дописать код, проверяющий корректность данных.
    }

    public static void main(String[] args) {
        Task1 T = new Task1();
        T.setCardNumber("1234567890123456");
        T.hiding();
    }
}






