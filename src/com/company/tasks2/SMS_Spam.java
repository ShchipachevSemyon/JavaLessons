package com.company.tasks2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SMS_Spam {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<Character> one = new ArrayList<>();
        one.add('a');
        one.add('b');
        one.add('c');
        List<Character> two = new ArrayList<>();
        two.add('d');
        two.add('e');
        two.add('f');
        List<Character> three = new ArrayList<>();
        three.add('g');
        three.add('h');
        three.add('i');
        List<Character> four = new ArrayList<>();
        four.add('j');
        four.add('k');
        four.add('l');
        List<Character> five = new ArrayList<>();
        five.add('m');
        five.add('n');
        five.add('o');
        List<Character> six = new ArrayList<>();
        six.add('p');
        six.add('q');
        six.add('r');
        List<Character> seven = new ArrayList<>();
        seven.add('s');
        seven.add('t');
        seven.add('u');
        List<Character> eight = new ArrayList<>();
        eight.add('v');
        eight.add('w');
        eight.add('x');
        List<Character> nine = new ArrayList<>();
        nine.add('y');
        nine.add('z');
        List<Character> zero = new ArrayList<>();
        zero.add('.');
        zero.add(',');
        zero.add('!');
        List<Character> grid = new ArrayList<>();
        grid.add(' ');

        int step = 0;

        String line = in.nextLine();

        for (int i = 0; i < line.length(); i++) {
            if (one.contains(line.charAt(i))) {
                if (line.charAt(i) == 'a') {
                    step++;
                } else if (line.charAt(i) == 'b') {
                    step += 2;
                } else if (line.charAt(i) == 'c') {
                    step += 3;
                }
            } else if (two.contains(line.charAt(i))) {
                if (line.charAt(i) == 'd') {
                    step++;
                } else if (line.charAt(i) == 'e') {
                    step += 2;
                } else if (line.charAt(i) == 'f') {
                    step += 3;
                }
            } else if (three.contains(line.charAt(i))) {
                if (line.charAt(i) == 'g') {
                    step++;
                } else if (line.charAt(i) == 'h') {
                    step += 2;
                } else if (line.charAt(i) == 'i') {
                    step += 3;
                }
            } else if (four.contains(line.charAt(i))) {
                if (line.charAt(i) == 'j') {
                    step++;
                } else if (line.charAt(i) == 'k') {
                    step += 2;
                } else if (line.charAt(i) == 'l') {
                    step += 3;
                }
            } else if (five.contains(line.charAt(i))) {
                if (line.charAt(i) == 'm') {
                    step++;
                } else if (line.charAt(i) == 'n') {
                    step += 2;
                } else if (line.charAt(i) == 'o') {
                    step += 3;
                }
            } else if (six.contains(line.charAt(i))) {
                if (line.charAt(i) == 'p') {
                    step++;
                } else if (line.charAt(i) == 'q') {
                    step += 2;
                } else if (line.charAt(i) == 'r') {
                    step += 3;
                }
            } else if (seven.contains(line.charAt(i))) {
                if (line.charAt(i) == 's') {
                    step++;
                } else if (line.charAt(i) == 't') {
                    step += 2;
                } else if (line.charAt(i) == 'u') {
                    step += 3;
                }
            } else if (eight.contains(line.charAt(i))) {
                if (line.charAt(i) == 'v') {
                    step++;
                } else if (line.charAt(i) == 'w') {
                    step += 2;
                } else if (line.charAt(i) == 'x') {
                    step += 3;
                }
            } else if (nine.contains(line.charAt(i))) {
                if (line.charAt(i) == 'y') {
                    step++;
                } else if (line.charAt(i) == 'z') {
                    step += 2;
                }
            } else if (zero.contains(line.charAt(i))) {
                if (line.charAt(i) == '.') {
                    step++;
                } else if (line.charAt(i) == ',') {
                    step += 2;
                } else if (line.charAt(i) == '!') {
                    step += 3;
                }
            } else if (grid.contains(line.charAt(i))) {
                step++;

            }
        }
        System.out.println(step);
    }
}
