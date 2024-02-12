package ru.inno.course.homework4;

public class Task4CheckingUrl {

    String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public static void main(String[] args) {

        Task4CheckingUrl checkUrL = new Task4CheckingUrl();
        checkUrL.setUrl("http://vk.com");
        if(checkUrL.url.startsWith("https://")) {
            System.out.println("Соединение безопасное");
        } else {
            System.out.println("Небезопасно. Не указывайте логины, пароли и данные банковских карт.");
        }
    }
}
