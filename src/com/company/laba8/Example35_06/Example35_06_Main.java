package com.company.laba8.Example35_06;

public class Example35_06_Main {

    public static void main(String[] args) {

        Example35_06_Node head;
        head = Example35_06_Node.createHead(5);
        System.out.println("После создания списка");
        System.out.println(head.toString());

        Example35_06_Node node1 = new Example35_06_Node(8, null);
        Example35_06_Node.AddLast(head, node1);
        System.out.println("После добавления элемента в конец списка");
        System.out.println(head.toString());

        Example35_06_Node.RemoveLast(head);
        System.out.println("После того как удалили последний элемент из списка");
        System.out.println(head.toString());

        Example35_06_Node node2 = new Example35_06_Node(15, null);
        Example35_06_Node.Insert(head, node2, 3);
        System.out.println("После того как вставили элемент в 3 позицию");
        System.out.println(head.toString());

        Example35_06_Node.Remove(head, 3);
        System.out.println("После того, как удалили 3 элемент из списка");
        System.out.println(head.toString());

        Example35_06_Node head2;
        head2 = Example35_06_Node.createTailRec(10);
        System.out.println("Создаем однонаправленный список через рекурсию и выводим его через рекурсивный метод");
        System.out.println(head2.toStringRec());
    }
}

