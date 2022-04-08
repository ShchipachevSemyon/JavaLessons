package com.company.laba9;

import java.util.*;

public class Example35_01 {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Map<Integer, Integer> hashMap = new HashMap<>();
        HashSet<Integer> hashSet = new HashSet<>();
        System.out.println("Время выполнения операции добавления arrayList = " + getRunningTime(arrayList));
        System.out.println("Время выполнения операции добавления HashMap = " + getRunningTimeHashMap(hashMap));
        System.out.println("Время выполнения операции добавления HashSet = " + getRunningTimeHashSet(hashSet));
        System.out.println(arrayList.size());
        System.out.println(hashMap.size());
        System.out.println(hashSet.size());
        System.out.println("Время выполнения операции добавления элемента в начало arrayList = " + getRunningTimeAdd(arrayList, 0, 0));
        System.out.println("Время выполнения операции добавления элемента в середину arrayList = " + getRunningTimeAdd(arrayList, 0, 7500000));
        System.out.println("Время выполнения операции добавления элемента в конец arrayList = " + getRunningTimeAdd(arrayList, 0, 14999999));
        System.out.println("Время выполнения операции добавления элемента HashMap = " + getRunningTimeAddHashMap(hashMap, 1600000, 149999));
        System.out.println("Время выполнения операции добавления элемента HashSet = " + getRunningTimeAddHashSet(hashSet, 15000000));
        System.out.println(arrayList.size());
        System.out.println(hashMap.size());
        System.out.println(hashSet.size());
        System.out.println("Время выполнения операции удаления элемента с начала arrayList = " + getRunningTimeRemove(arrayList, 0));
        System.out.println("Время выполнения операции удаления элемента в середине arrayList = " + getRunningTimeRemove(arrayList, 7500000));
        System.out.println("Время выполнения операции удаления элемента в конце arrayList = " + +getRunningTimeRemove(arrayList, 14999999));
        System.out.println("Время выполнения операции удаления элемента HashMap = " + +getRunningTimeRemoveHashMap(hashMap, 999999));
        System.out.println("Время выполнения операции удаления элемента HashSet = " + +getRunningTimeRemoveHashSet(hashSet, 5));
        System.out.println(arrayList.size());
        System.out.println(hashMap.size());
        System.out.println(hashSet.size());
        System.out.println("Время выполнения операции получения элемента по индексу arrayList = " + getRunningTimeIndex(arrayList));
        System.out.println("Время выполнения операции получения элемента по индексу HashMap = " + getRunningTimeIndexHashMap(hashMap));
        System.out.println("Время выполнения операции получения элемента HashSet = " + getRunningTimeElement(hashSet));
    }

    private static long getRunningTime(List<Integer> list) {
// точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
// блок кода в котором выполняется операция добавления
        for (int i = 0; i < 15000000; i++) {
            list.add(i);
        }
// точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
// вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeHashSet(Set<Integer> set) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1500000; i++) {
            set.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }


    private static long getRunningTimeRemove(List<Integer> list, Integer a) {

        long start = System.currentTimeMillis();
        list.remove(a);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeRemoveHashSet(Set<Integer> set, Integer a) {

        long start = System.currentTimeMillis();
        set.remove(a);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeAdd(List<Integer> list, int a, Integer index) {
        long start = System.currentTimeMillis();
        list.add(index, a);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeAddHashSet(Set<Integer> set, int a) {
        long start = System.currentTimeMillis();
        set.add(a);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeAddHashMap(Map<Integer, Integer> list, Integer k, Integer v) {
        long start = System.currentTimeMillis();
        list.put(k, v);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeIndex(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i=0; i<15000000;i++){
            list.get(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    private static long getRunningTimeElement(Set<Integer> set) {
        long start = System.currentTimeMillis();
        for (int i = 0; i<1500000;i++){
            set.contains(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeIndexHashMap(Map<Integer, Integer> map) {
        long start = System.currentTimeMillis();
        for (int i = 0;i<1500000;i++){
            map.get(i);
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeHashMap(Map<Integer, Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1500000; i++) {
            list.put(i, i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long getRunningTimeRemoveHashMap(Map<Integer, Integer> list, Integer k) {

        long start = System.currentTimeMillis();
        list.remove(k);
        long end = System.currentTimeMillis();
        return end - start;
    }
}


