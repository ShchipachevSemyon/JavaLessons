package com.company.laba8.Example35_06;

public class Example35_06_Node {
    public int value;
    public Example35_06_Node next;
    public static Example35_06_Node ref;
    static int counter = 0;

    Example35_06_Node(int value, Example35_06_Node next){
        this.value = value;
        this.next = next;
    }

    public static Example35_06_Node createTail(int listValue){
        Example35_06_Node head = new Example35_06_Node(0, null);
        Example35_06_Node tail = head;
        for (int i = 0; i < listValue; i++){
            tail.next = new Example35_06_Node(i+1, null);
            tail = tail.next;
        }
        return head;
    }
    public static Example35_06_Node createHead(int listValue){
        Example35_06_Node head = null;
        for (int i = listValue; i >= 0; i--) {
            head = new Example35_06_Node(i, head);
        }
        return head;
    }
    @Override
    public String toString(){
        ref = this;
        String list = "";
        while (ref != null){
            list += ref.value + " ";
            ref = ref.next;
        }
        return list;
    }
    public static Example35_06_Node AddFirst(Example35_06_Node head, Example35_06_Node newHead){
        newHead = new Example35_06_Node(newHead.value, head);
        return newHead;
    }
    public static void AddLast(Example35_06_Node head, Example35_06_Node tail){
        ref = head;
        while (ref.next != null){
            ref = ref.next;
        }
        ref.next = tail;
    }
    public static void Insert(Example35_06_Node head, Example35_06_Node newNode, int elemPosition){
        ref = head;
        int counter = 1;
        while (ref.next != null && (counter < elemPosition)){
            ref = ref.next;
            counter++;
        }
        newNode.next = ref.next;
        ref.next = newNode;
    }
    public static Example35_06_Node RemoveFirst(Example35_06_Node head){
        head = head.next;
        return head;
    }
    public static void RemoveLast(Example35_06_Node head){
        ref = head;
        while (ref.next.next != null){
            ref = ref.next;
        }
        ref.next = null;
    }
    public static void Remove(Example35_06_Node head, int delElemPosition){
        ref = head;
        int counter = 1;
        while (ref.next != null && (counter < delElemPosition)){
            ref = ref.next;
            counter++;
        }
        ref.next = ref.next.next;
    }
    public static Example35_06_Node createTailRec(int listValue) {
        if (counter <= listValue){
            return new Example35_06_Node(counter++, createTailRec(listValue));
        }
        else
            counter = 0;
        return null;
    }
    public static Example35_06_Node createHeadRec(int listValue){
        if (listValue == 0){
            return null;
        }
        listValue -= 1;
        return new Example35_06_Node(listValue, createHeadRec(listValue));
    }
    public String toStringRec(){
        if (counter == 0){
            counter = 1;
            ref = this;
        }
        if (ref.next != null){
            String list = ref.value + " ";
            ref = ref.next;
            return list + toStringRec();
        }else
            counter = 0;
        return ref.value + " ";
    }
}


