package ru.learnJava;

import ru.learnJava.structure.MyStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) throws IOException {
        Tasks.matrix(3);
    }

    public static String checkBrackets(String input) {
        MyStack myStack = new MyStack(input.length());
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            switch (currentChar) {
                case '(':
                case '[':
                case '{':
                    myStack.push(currentChar);
                    break;
                case ')':
                case ']':
                case '}':
                    if(!myStack.isEmpty()) {
                        char popStackChar = myStack.pop();
                        if ((currentChar == ')' && popStackChar != '(') ||
                            (currentChar == '}' && popStackChar != '{') ||
                            (currentChar == ']' && popStackChar != '[')) {
                            return "error " + currentChar + " at " + i;
                        }
                    } else {
                        return "stack is empty";
                    }
                    break;
            }
        }
        if(!myStack.isEmpty()) {
            return "error: missing dilimiter";
        }
        return "good";
    }

}
