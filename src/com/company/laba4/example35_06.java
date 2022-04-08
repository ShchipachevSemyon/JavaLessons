package com.company.laba4;

import java.util.Random;
import java.util.Scanner;

public class example35_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введие число строк массива ");
        int line = scanner.nextInt();
        System.out.println("Введите число столбцов массива");
        int column = scanner.nextInt();
        System.out.println("Массив чисел состоящий из " + line + " строк и " + column + " столбцов");
        int[][] array = new int[line][column];
        int i;
        int j;
        for (i = 0; i < line; i++) {
            for (j = 0; j < column; j++) {
                array[i][j] = random.nextInt(9);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int line1 = random.nextInt(line);
        int column1 = random.nextInt(column);
        System.out.println("Массив чисел в котором удалена строка № " + (line1 + 1) + " и столбец № " + (column1 + 1));
        for (i = 0; i < line; i++) {
            if (i == line1) {
                continue;
            }
            for (j = 0; j < column; j++) {
                if (j == column1) {
                    continue;
                }
                {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
