package ru.learnJava.structure;

public class MyStack {
    private int[] array;
    private int arraySize;
    private int position;

    public MyStack(int size) {
        arraySize = size;
        array = new int[arraySize];
        position = -1;
    }

    public void push(int number) {
        if(!isFull()) {
            array[++position] = number;
        } else System.out.println("Stack is full");
    }

    public int pop() {
        if(!isEmpty()) {
            return array[position--];
        } else return -1001;
    }

    public int peek() {
        return array[position];
    }

    public boolean isEmpty() {
        return position == -1;
    }

    public boolean isFull() {
        return position == arraySize - 1;
    }
}
