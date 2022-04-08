package com.company.laba1;

import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = s.nextLine();
        System.out.println("Input last name: ");
        String last_name = s.nextLine( );
        System.out.println("Input patronymic: ");
        String patronymic = s.nextLine( );
        System.out.printf("Hallo " + name + " " + last_name + " " + patronymic );
        s.close();
    }
}