package org.example;

import org.example.Interface.IntList;

public class IntArrayList implements IntList {

    private int[] array;
    private int count;

    public IntArrayList() {
        array = new int[10];
        count = 0;
    }

@Override
    public void add(int number) {
        if (count == array.length) {
            int newLength = array.length + (array.length / 2);
            int[] newArr = new int[newLength];
            System.arraycopy(array, 0, newArr, 0,array.length);
            array = newArr;
        }
        array[count++] = number;
    }

@Override
    public int get(int id) {
        if (id < 0 || id >= count) {
            throw new IndexOutOfBoundsException("Index: " + id + ", Size: " + count);
        }
        return array[id];
    }

    @Override
    public int size() {
        return count;
    }

}
