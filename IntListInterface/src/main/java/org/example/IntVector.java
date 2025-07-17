package org.example;

import org.example.Interface.IntList;

public class IntVector implements IntList {
    private int[] arr;
    private int count;

    public IntVector() {
        arr = new int[20];
        count = 0;
    }

    @Override
    public void add(int number) {
        if (count == arr.length) {
            int newLength = arr.length * 2; // double the size
            int[] newArr = new int[newLength];
            System.arraycopy(arr, 0, newArr, 0, arr.length);
            arr = newArr;
        }
        arr[count++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= count) {
            throw new IndexOutOfBoundsException("Index: " + id + ", Size: " + count);
        }
        return arr[id];
    }
    @Override
    public int size() {
        return count;
    }
}
