package org.example;

import java.util.Scanner;

public class ShestVDes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Запрашиваем у пользователя ввод шестнадцатеричного числа
        System.out.print("Введите шестнадцатеричное число: ");
        String hex = in.nextLine();

        // Переводим шестнадцатеричное число в десятичное
        int res = from16to10(hex);

        // Выводим результат
        System.out.println("Десятичное число: " + res);
    }

    // Метод для перевода из шестнадцатеричной системы в десятичную
    public static int from16to10(String ch16) {
        int ch10 = 0;
        int step = ch16.length() - 1; // Индекс последнего символа
        for (int i = 0; i < ch16.length(); i++) {
            char TVChar = ch16.charAt(i); // Получаем текущий символ
            // Обрабатка  A-B-C-D-E-F
            if (TVChar == 'A') {
                ch10 += 10 * Math.pow(16, step); // 16^step
            } else if (TVChar == 'B') {
                ch10 += 11 * Math.pow(16, step);
            } else if (TVChar == 'C') {
                ch10 += 12 * Math.pow(16, step);
            } else if (TVChar == 'D') {
                ch10 += 13 * Math.pow(16, step);
            } else if (TVChar == 'E') {
                ch10 += 14 * Math.pow(16, step);
            } else if (TVChar == 'F') {
                ch10 += 15 * Math.pow(16, step);
            } else {
                ch10 += Character.getNumericValue(TVChar) * Math.pow(16, step); // Для цифр 0-9
            }
            step--;
        }
        // Возвращаем десятичное число
        return ch10;
    }
}
