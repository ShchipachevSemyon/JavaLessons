package com.company.laba6;

public class Example35_10 {
    static int[] returnTwo(int... nums) {
        int temp;
        int copyArr[] = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            copyArr[0] = nums[0];
            copyArr[1] = nums[nums.length - 1];
        }
        if (nums.length == 1) {
            copyArr[0] = nums[0];
            copyArr[1] = nums[0];
        }
        return copyArr;
    }
}
