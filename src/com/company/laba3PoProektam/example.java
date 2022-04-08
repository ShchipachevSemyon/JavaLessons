package com.company.laba3PoProektam;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите бюждет проекта ");
        int budget = scanner.nextInt();
        System.out.println("Введите сроки проекта ");
        int time = scanner.nextInt();
        System.out.println("Введите время проверки проекта");
        int checkTime = scanner.nextInt();
        System.out.println("Введите степень готовности проекта");
        int readiness = scanner.nextInt();
        System.out.println("Введите расходы");
        int expenses = scanner.nextInt();
        float readiness1 = readiness * budget / 100;
        float delay = checkTime * budget / readiness1 - time;
        int overspending = (int) ((expenses * (checkTime * budget / readiness1)) / checkTime - budget);
        System.out.println("Задержка сроков = " + delay + " перерасход бюждета составит = " + overspending);
    }
}
