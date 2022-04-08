package com.company.laba3;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class example35_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива:");
        int number = scanner.nextInt();

        int[] nums = new int[number];
        int[] nums1 = new int[number];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива [" + i + "] = " + nums[i]);
        }

        Arrays.sort(nums);
        System.out.println("Массив в порядке убывания:");

        for (int i = nums.length-1, j = 0; i >= 0; i--, j++) {
            nums1[j] = nums[i];
        }

        for (int i = 0; i < nums1.length; i++) {
            System.out.println("Элемент массива [" + i + "] = " + nums1[i]);
        }
    }
}
