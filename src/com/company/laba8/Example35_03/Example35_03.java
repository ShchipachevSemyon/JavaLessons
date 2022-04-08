package com.company.laba8.Example35_03;

import java.util.Arrays;
import java.util.Scanner;

public class Example35_03 {

    static int nums[];
    public static int j = 0;
    static Scanner scanner = new Scanner(System.in);

    public static int[] arrays(int arr) {
        if (j == 0) {
            nums = new int[arr];
        }
        if (j < arr) {
            System.out.println("Введите число");
            nums[j] = scanner.nextInt();
            j++;
            arrays(arr);
        }
        return nums;
    }
    public static void copy(int arr){
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
         int num = scanner.nextInt();
        System.out.println(Arrays.toString(arrays(num)));
        copy (num);
    }
}
