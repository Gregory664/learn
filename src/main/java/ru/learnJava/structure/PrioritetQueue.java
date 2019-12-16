package ru.learnJava.structure;

import javax.swing.plaf.nimbus.AbstractRegionPainter;

public class PrioritetQueue {
    private int[] array;
    private int maxSize;
    private int countOfElements;

    public PrioritetQueue(int count) {
        maxSize = count;
        array = new int[maxSize];
        countOfElements = 0;
    }

    public void insert(int number) {
        int i;

        if(countOfElements == 0) {
            array[countOfElements++] = number;

        } else {
            for (i = countOfElements - 1; i >= 0; i--) {
                if (number > array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = number;
            countOfElements++;
        }
    }

    public int remove() {
        return array[--countOfElements];
    }

    public int peek() {
        return array[countOfElements - 1];
    }

    public boolean isEmpty() {
        return countOfElements == 0;
    }

    public boolean isFull() {
        return countOfElements == maxSize;
    }

}
