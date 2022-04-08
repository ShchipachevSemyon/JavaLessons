package com.company.laba6;

public class Example35_07 {
    static int[] returnCode(char arr[]) {
        int copyArr[] = new int[arr.length];
        System.out.print("Представление сивволов в юникоде:");
        for (int i = 0; i < copyArr.length; i++) {
            copyArr[i] = (int) arr[i];
            System.out.print("\n" + arr[i] + " : " + copyArr[i]);
        }
        return copyArr;
    }
}
