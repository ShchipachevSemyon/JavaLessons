package com.company.tasks2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheAmount {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int step = 0;
        List <Character> firstBox = new ArrayList<>();
        firstBox.add('A');
        firstBox.add('P');
        firstBox.add('O');
        firstBox.add('R');

        List <Character> secondBox= new ArrayList<>();
        secondBox.add('B');
        secondBox.add('M');
        secondBox.add('S');

        List <Character> thirdBox = new ArrayList<>();
        thirdBox.add('D');
        thirdBox.add('G');
        thirdBox.add('J');
        thirdBox.add('K');
        thirdBox.add('T');
        thirdBox.add('W');

        int n = in.nextInt();
        List<String> names = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            names.add(in.nextLine());
        }
        names.remove(0);
        for (int i = 0; i < names.size(); i++) {
            if (step == 0) {
                if (firstBox.contains(names.get(i).charAt(0))) {
                } else if (secondBox.contains(names.get(i).charAt(0))) {
                    step++;
                } else if (thirdBox.contains(names.get(i).charAt(0))) {
                    step += 2;
                }
            } else if (firstBox.contains(names.get(i - 1).charAt(0))) {
                if (firstBox.contains(names.get(i).charAt(0))) {
                } else if (secondBox.contains(names.get(i).charAt(0))) {
                    step++;
                } else if (thirdBox.contains(names.get(i).charAt(0))) {
                    step += 2;
                }
            } else if (secondBox.contains(names.get(i - 1).charAt(0))) {
                if (firstBox.contains(names.get(i).charAt(0))) {
                    step++;
                } else if (secondBox.contains(names.get(i).charAt(0))) {

                } else if (thirdBox.contains(names.get(i).charAt(0))) {
                    step++;
                }
            } else if (thirdBox.contains(names.get(i - 1).charAt(0))) {
                if (firstBox.contains(names.get(i).charAt(0))) {
                    step += 2;
                } else if (secondBox.contains(names.get(i).charAt(0))) {
                    step++;
                } else if (thirdBox.contains(names.get(i).charAt(0))) {
                }
            }
        }
        System.out.println(step);
    }
}