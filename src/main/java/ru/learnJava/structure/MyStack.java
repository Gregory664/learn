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

    public char peekN(int n) {
        return array[n];
    }

    public int size() {
        return position + 1;
    }

    public boolean isEmpty() {
        return position == -1;
    }

    public boolean isFull() {
        return position == arraySize - 1;
    }

    public void display(String s) {
        System.out.print(s);
        System.out.println("Stack (bottom-->top): ");
        for (int i = 0; i < size(); i++) {
            System.out.print(peekN(i));
            System.out.print(" ");
        }
        System.out.println();
    }
}
