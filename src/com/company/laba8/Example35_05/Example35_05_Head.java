package com.company.laba8.Example35_05;

public class Example35_05_Head {
    public static void main(String[] args) {
        Example35_05_Node head = new Example35_05_Node(0, null);
        Example35_05_Node tail = head;
        for (int i = 0; i < 9; i++) {
            tail.next = new Example35_05_Node(i + 1, null);
            tail = tail.next;
        }
        Example35_05_Node ref = head;
        while (ref!=null){
            System.out.println(""+ref.value);
            ref = ref.next;
        }
    }
}
