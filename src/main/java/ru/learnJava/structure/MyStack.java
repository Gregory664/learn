package ru.learnJava.structure;

public class MyStack {
    private char[] array;
    private int arraySize;
    private int position;

    public MyStack(int size) {
        arraySize = size;
        array = new char[arraySize];
        position = -1;
    }

    public void push(char number) {
        if(!isFull()) {
            array[++position] = number;
        } else System.out.println("Stack is full");
    }

    public char pop() {
        if(!isEmpty()) {
            return array[position--];
        } else return ' ';
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
