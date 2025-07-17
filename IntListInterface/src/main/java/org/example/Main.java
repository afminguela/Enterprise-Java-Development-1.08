package org.example;

import org.example.Interface.IntList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IntList list1 = new IntArrayList();
        IntList list2 = new IntVector();

        for (int i = 0; i < 25; i++) {
            list1.add(i);
            list2.add(i * 10);
        }

        System.out.println("IntArrayList elements:");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }

        System.out.println("\nIntVector elements:");
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
    }
}