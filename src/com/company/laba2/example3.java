package com.company.laba2;

import java.util.Scanner;
public class example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number%4==0 && number>=10){
            System.out.println("The number fits the requirements");
        }else {
            System.out.println("The number does not meet the requirements");
            }
        }
    }