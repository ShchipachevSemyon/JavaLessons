package com.company.laba3;

import java.util.Scanner;

public class example35_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели");
        String day = scanner.next();
        switch(day){
            case "Понедельник":
                System.out.println("Первый день недели");
                break;
            case "Вторник":
                System.out.println("Второй день недели");
                break;
            case "Среда":
                System.out.println("Третий день недели");
                break;
            case "Четверг":
                System.out.println("Четвертый день недели");
                break;
            case "Пятница":
                System.out.println("Пятый день недели");
                break;
            case "Суббота":
                System.out.println("Шестой день недели");
                break;
            case "Воскресенье":
                System.out.println("Седьмой день недели");
                break;
            case "понедельник":
                System.out.println("Первый день недели");
                break;
            case "вторник":
                System.out.println("Второй день недели");
                break;
            case "среда":
                System.out.println("Третий день недели");
                break;
            case "четверг":
                System.out.println("Четвертый день недели");
                break;
            case "пятница":
                System.out.println("Пятый день недели");
                break;
            case "суббота":
                System.out.println("Шестой день недели");
                break;
            case "воскресенье":
                System.out.println("Седьмой день недели");
                break;
            default:
                System.out.println("Такого дня нет");

        }
    }
}
