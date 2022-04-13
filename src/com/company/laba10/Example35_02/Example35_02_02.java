package com.company.laba10.Example35_02;

import java.util.*;

public class Example35_02_02 {
    public static void main(String[] args) {
        try {
            Random r = new Random();
            System.out.println("Введите число строк матрицы");
            Scanner scanner = new Scanner(System.in);
            int s = scanner.nextInt();
            System.out.println("Введите число столбцов матрицы");
            int p = scanner.nextInt();
            int array[][] = new int[s][p];
            for (int i = 0; i < s; i++) {
                for (int j = 0; j < p; j++) {
                    array[i][j] = r.nextInt();
                }
            }
            System.out.println("Введите номер столба, который хотите вывести");
            int g = scanner.nextInt();
            for (int i = 0; i < s; i++) {
                System.out.println(array[i][g - 1]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e + " нет столбца с таким номером");
        } catch (InputMismatchException e){
            System.out.println("Ошибка: " + e +" введена строка вместо числа");
        }
    }
}
