package com.goodline.lessons;

import java.util.Scanner;

public class ConditionPractive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        System.out.println();
        // Узнаем что ввел пользователь и сохраняем в переменную

        if(number < 5){
            System.out.println("Маленькое число");
        } else if(number > 15) {
            System.out.println("Большое число");
        } else {
            System.out.println("То что надо");
        }

        switch (number) {
            case 1:
                System.out.println("1");
                System.out.println("dfsd");

            case 2:
                System.out.println("2");
            default:
                System.out.println("Что-то другое");
        }
        // Если то, что ввел пользователь меньше 5, то выводим "Маленькое число"

        // В другом случае если больше 15, то выводим "Большое число"

        // Во всех других случаях выводим "То, что надо!"
    }
}
