package org.example;

import java.util.Scanner;

public class DesVDvoich {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите десятичное число: ");
        int des = in.nextInt();
        //проверка на 0
        if (des == 0)
            System.out.println("Двоичное число: 0");
        //хранение двоичного числа
        String chislo = "";
        // Цикл перевода десятичного числа в двоичное
        //пока число больше 0
        while (des > 0) {
            // Получаем остаток от деления на 2
            // И добавляем его в начало строки
            chislo = (des % 2) + chislo;
            // Делим число на 2
            des /= 2;
        }
        // Выводим двоичного числа
        System.out.println("Двоичное число: " + chislo);
    }
}