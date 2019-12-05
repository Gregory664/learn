package ru.learnJava;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortsTest {
    private int[] array;
    private int[] sortedArray = {1, 2, 3, 4, 5};

    @Before
    public void setUp() {
        array = new int[] {5, 4, 3, 2, 1};
    }

    @Test
    public void bubbleSort() {
        Sorts.bubbleSort(array);
        assertArrayEquals(array, sortedArray);
    }

    @Test
    public void selectSort() {
        Sorts.selectSort(array);
        assertArrayEquals(array, sortedArray);
    }

    @Test
    public void insertSort() {
        Sorts.insertSort(array);
        assertArrayEquals(array, sortedArray);
    }
}