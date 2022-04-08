package com.company.laba3;

public class example35_08 {
    public static void main(String[] args) {
        final int A = 65;

        char[] targetArray = new char[10];

        for (int count = 0, i = 0; count < 10; i++) {
            char liter = (char) (A + i);

            if (liter != 'A' && liter != 'E' && liter != 'I') {
                targetArray[count] = liter;
                count++;
            }
        }

        System.out.println("Первые 10 согласных: ");

        for (char x : targetArray) {
            System.out.println(x);
        }
    }

    public static boolean isContain(char[] string, char liter) {
        for (char x : string) {
            if (liter == x) {
                return true;
            }
        }
        return false;
    }
}

