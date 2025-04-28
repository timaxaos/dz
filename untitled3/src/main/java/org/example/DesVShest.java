package org.example;

import java.util.Scanner;

public class DesVShest {

    public static String from10to16(int ch10) {
        //переменная накапливает результат
        String res = "";
        //пока больше 15 делим и собираем остатки
        while (ch10 > 15) {
            //остсток от /16 > 9
            if (ch10 % 16 > 9) {
                // Обрабатка  A-B-C-D-E-F
                if (ch10 % 16 == 10) res = "A" + res;
                else if (ch10 % 16 == 11) res = "B" + res;
                else if (ch10 % 16 == 12) res = "C" + res;
                else if (ch10 % 16 == 13) res = "D" + res;
                else if (ch10 % 16 == 14) res = "E" + res;
                else if (ch10 % 16 == 15) res = "F" + res;
            } else {
                // если остаток от 0 до 9 добавляем цифру
                res = (ch10 % 16) + res;
            }

            ch10 = ch10 / 16;
        }
        // добавляем последнюю цифру
        res = ch10 + res;
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите десятичное число для преобразования в шестнадцатеричное:");
        int deciatichnoe = in.nextInt();

        String hex = from10to16(deciatichnoe);

        System.out.println("Число " + deciatichnoe + " в шестнадцатеричной системе: " + hex);

    }
}
