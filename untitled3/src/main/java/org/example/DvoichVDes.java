package org.example;
import java.util.Scanner;

public class DvoichVDes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите двоичное число: ");
        String chislo = in.next();
        // хранение результата
        int res = 0;
//начальне значение степени =1
        int stepen = 1;
        //  обработка каждого бита двоичного числа ,начинаеться с конца
        for (int i = chislo.length() - 1; i >= 0; i--) {
            // Получаем текущий символ (бит) по индексу i
            char bit = chislo.charAt(i);
            // Проверка бита
            if (bit == '1') {
                res += stepen;
            } else if (bit != '0') {
                // Если бит не '0' и не '1', выводим сообщение об ошибке
                System.out.println("Введите  0 и 1.");
                // Завершаем программу
                return;
            }
            // Увеличиваем степень двойки для следующего разряда (1→2→4→8...)
            stepen *= 2;
        }
        // Выводим полученное десятичное число
        System.out.println("Десятичное число: " + res);
    }
}