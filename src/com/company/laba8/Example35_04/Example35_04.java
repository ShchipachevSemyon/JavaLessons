package com.company.laba8.Example35_04;

public class Example35_04 {

    public static void main(String[] args) {
        Example35_04_Node node0 = new Example35_04_Node(0, null);
        Example35_04_Node node1 = new Example35_04_Node(1, null);
        Example35_04_Node node2 = new Example35_04_Node(2, null);
        Example35_04_Node node3 = new Example35_04_Node(3, null);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        Example35_04_Node ref = node0;
        while (ref != null) {
            System.out.print("" + ref.value);
            ref = ref.next;
        }
    }
}

