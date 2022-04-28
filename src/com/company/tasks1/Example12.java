package com.company.tasks1;

import java.io.PrintWriter;
import java.util.*;


public class Example12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int size = 8;
        int[] dx = {-2, -2, 2, 2, -1, 1, -1, 1};
        int[] dy = {1, -1, 1, -1, 2, 2, -2, -2};

        int a = in.nextInt();
        List<String> move = new ArrayList<>(a);

        for (int i = 0; i < a; i++) {
            move.add(in.next());}
        for (String s : move){
            int post = s.charAt(0) - 'a';
            int line = s.charAt(1) - '1';
            int currentX, currentY, positionCount = 0;
            for (int i = 0; i < size; i++) {
                currentX = post + dx[i];
                currentY = line + dy[i];
                if (currentX >= 0 && currentX < size && currentY >= 0 && currentY < size)
                    positionCount++;
            }
            out.println(positionCount);
            out.flush();
        }
    }
}


