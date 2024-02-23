package ru.inno.course.homework4;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task5_6Password {

    private String password;

    String regexOne = "[0-9]";
    String regexTwo = "[!@#$%^&*№]";

    boolean passwordLengthIsEigthSymbol;
    boolean passwordContainsAtLeastOneDigit;
    boolean passwordContainsAtLeastOneSymbol;
    boolean finalCheck;

    private void setPassword(String pass) {
        this.password = pass;
    }

    private void passwordComparation(String pass) {
        if ((pass.equals("Qwerty0987654321")) & (finalCheck)) {
            System.out.println("Доступ разрешен");
        } else System.out.println("Доступ запрещен");
    }

    private void passwordLenghtChecking(String pass1) {
        if (pass1.length() < 8) {
            System.out.println("Пароль должен содержать не менее 8 символов");
            passwordLengthIsEigthSymbol = false;
        } else this.passwordLengthIsEigthSymbol = true;
    }

    private void passwordDigitChecking(String pass2) {
        Pattern p1 = Pattern.compile(regexOne, Pattern.CASE_INSENSITIVE);
        Matcher m1 = p1.matcher(pass2);
        if(m1.find()) {
        passwordContainsAtLeastOneDigit = true;
        } else {
            System.out.println("Пароль должен содержать минимум 1 цифру");
            passwordContainsAtLeastOneDigit = false;
        }
    }

    private void passwordSymbolChecking(String pass3) {
        Pattern p2 = Pattern.compile(regexTwo, Pattern.CASE_INSENSITIVE);
        Matcher m2 = p2.matcher(pass3);
        if (m2.find()) {
            passwordContainsAtLeastOneSymbol = true;
        } else {
            System.out.println("Пароль должен содержать минимум 1 спецсимвол");
            passwordContainsAtLeastOneSymbol = false;
        }
    }

    private void passwordOverSchecking(String p) {
        this.passwordLenghtChecking(p);
        this.passwordDigitChecking(p);
        this.passwordSymbolChecking(p);
        if(passwordLengthIsEigthSymbol & passwordContainsAtLeastOneDigit & passwordContainsAtLeastOneSymbol) {
            System.out.println("Пароль принят");
            this.finalCheck = true;
        } else {
            this.finalCheck = false;
        }
    }

    public static void main(String[] args) {

        Task5_6Password passwordChecker = new Task5_6Password();

        passwordChecker.setPassword("Qwerty0987654321");

        passwordChecker.passwordOverSchecking(passwordChecker.password);

        passwordChecker.passwordComparation(passwordChecker.password);
    }
}

