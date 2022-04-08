package com.company.laba8.Example35_05;

public class Example35_05_Tail {
    public static void main(String[] args) {
        Example35_05_Node head = null;
        for (int i = 9; i >= 0; i--) {
            head = new Example35_05_Node(i, head);
        }
        Example35_05_Node ref = head;
        while (ref != null) {
            System.out.println("" + ref.value);
            ref = ref.next;
        }
    }
}
