package com.company.laba2;

import java.util.Scanner;
public class example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number%5==2 && number%7==1){
            System.out.println("The number fits the requirements");
        }else {
            System.out.println("The number does not meet the requirements");
        }
    }
}
