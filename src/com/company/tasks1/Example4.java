package com.company.tasks1;

import java.io.PrintWriter;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        if (a<=4){
            out.println("few");
            out.flush();
        }
        if (a>=5 & a<=9){
            out.println("several");
            out.flush();
        }
        if (a>=10 & a<=19){
            out.println("pack");
            out.flush();
        }
        if (a>=20 & a<=49){
            out.println("lots");
            out.flush();
        }
        if (a>=50 & a<=99){
            out.println("horde");
            out.flush();
        }
        if (a>=100 & a<=249){
            out.println("throng");
            out.flush();
        }
        if (a>=250 & a<=499){
            out.println("swarm");
            out.flush();
        }
        if (a>=500 & a<=999){
            out.println("zounds");
            out.flush();
        }
        if ( a >= 1000) {
            out.println("legion");
            out.flush();
        }
    }
}
