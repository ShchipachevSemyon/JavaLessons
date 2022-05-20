package com.company.tasks2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Penguins {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int value = in.nextInt();

        int firstViewPenguins = 0;
        List<Character> firstView = new ArrayList<>();
        firstView.add('E');

        int secondViewPenguins = 0;
        List<Character> secondView = new ArrayList<>();
        secondView.add('L');

        int thirdViewPenguins = 0;
        List<Character> thirdView = new ArrayList<>();
        thirdView.add('M');


        List<String> penguins = new ArrayList<>();
        for (int i = 0; i <= value; i++) {
            penguins.add(in.nextLine());
        }
        penguins.remove(0);

        for (int i = 0; i < penguins.size(); i++) {
            if (firstView.contains(penguins.get(i).charAt(0))) {
                firstViewPenguins++;
            } else if (secondView.contains(penguins.get(i).charAt(0))) {
                secondViewPenguins++;
            } else if (thirdView.contains(penguins.get(i).charAt(0))) {
                thirdViewPenguins++;
            }
        }
        if (firstViewPenguins > secondViewPenguins && firstViewPenguins > thirdViewPenguins) {
            System.out.println("Emperor Penguin");
        } else if (secondViewPenguins > firstViewPenguins && secondViewPenguins > thirdViewPenguins) {
            System.out.println("Little Penguin");
        } else {
            System.out.println("Macaroni Penguin");
        }
    }
}

