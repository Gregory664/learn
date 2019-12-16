package ru.learnJava.structure;

public class MyQueue {
    private int[] array;
    private int maxSize;
    private int front;
    private int rear;
    private int nItems;

    public MyQueue(int size) {
        this.maxSize = size;
        array = new int[size];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int item) {
        if(rear == maxSize - 1) {
            rear = -1;
        }
        array[++rear] = item;
        nItems++;
    }

    public int remove() {
        int result = array[front++];
        if(front == maxSize) {
            front = 0;
        }
        nItems--;
        return result;
    }

    public int peekFront() {
        return array[front];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public int size() {
        return nItems;
    }






}
