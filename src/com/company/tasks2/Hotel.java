package com.company.tasks2;

import java.io.PrintWriter;
import java.util.*;

public class Hotel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int num = in.nextInt();
        int array[][] = new int[num][num];

        for(int i = 0; i < num; i++) array[i][num-1] = (i+1)*(i+2)/2;

        for (int i = 0; i < num-1; i++) {
            for (int k = num - 2; k >= i; k--) array[i][k] = array[i][k+1] + num - k + i-1;
        }
        for (int i = 1; i < num; i++){
            for (int k = i-1; k>=0; k--) array[i][k] = array[i][k+1] + num + k - i;
        }
        for (int i = 0; i < num; i++){
            for (int k = 0; k < num; k++) System.out.print(array[i][k] + " ");
            System.out.println();
        }
    }
}
