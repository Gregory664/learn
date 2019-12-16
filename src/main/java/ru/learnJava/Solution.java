package ru.learnJava;

import ru.learnJava.structure.Link;
import ru.learnJava.structure.LinkList;

import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insertFirst(3, 3.0);
        linkList.insertFirst(4, 4.0);
        linkList.insertFirst(5, 5.0);

        Link test = linkList.delete(4);
        System.out.println();
    }

}
