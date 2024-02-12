package ru.inno.course.homework4;

public class Task5_6Password {

    private String password;

    private void setPassword(String pass) {
        this.password = pass;
    }

    private void passwordComparation(String pass) {
        if (pass.equals("Qwerty0987654321")) {
            System.out.println("Доступ разрешен");
        } else System.out.println("Доступ запрещен");
    }

    private void passwordChecking(String checkPass) {
        if (checkPass.length() < 8) {
            System.out.println("Пароль не менее 8 символов");
            /*Честно говоря, это единственное задание из блока, которое не выполнилось за пару минут. Я так и не приду -
            мал, как эффективно выполнить остальные проверки. Пробовал разные варианты, но они получались громоздкими,
            запутанными, с инициализацией дополнительных локальных переменных. Однако я уверен, что есть какое-то
            простое и изящное решение. Буду признателен, если вы намекнёте, в каком направлении мне искать.
            И ещё: я только вчера вечером сел вплотную изучать Git. Поэтому первая посылка файлов вышла так себе.
            Прошу извинить за эту оплошность. Исправлюсь.
             */
        } else System.out.println("Пароль принят");
    }

    public static void main(String[] args) {
        Task5_6Password passwordChecker = new Task5_6Password();
        passwordChecker.setPassword("Qwerty0987654321");
        passwordChecker.passwordComparation(passwordChecker.password);
        passwordChecker.passwordChecking(passwordChecker.password);
    }
}
