package com.company.laba4;

import java.util.Scanner;

public class example35_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = scanner.nextInt();
        int [] [] array = new int[number][number];
        for (int i = 0;i < number;i++){
            for(int j = 0; j < number;j++){
                array[i][j]=2 ;
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
