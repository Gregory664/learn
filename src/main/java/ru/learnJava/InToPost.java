package ru.learnJava;

import ru.learnJava.structure.MyStack;

public class InToPost {
    private MyStack theStack;
    private String input;
    private String output = "";

    public InToPost(String in) {
        this.input = in;
        theStack = new MyStack(in.length());
    }

    public String doTrans() {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
//            theStack.display("For " + ch + " ");
            switch (ch) {
                case '+':
                case '-':
                    getOper(ch, 1);
                    break;
                case '*':
                case '/':
                    getOper(ch, 2);
                    break;
                case '(':
                    theStack.push(ch);
                    break;
                case ')':
                    getParent(ch);
                    break;
                default:
                    output = output + ch;
                    break;
            }
        }
        while (!theStack.isEmpty()) {
//            theStack.display("While ");
            output = output + theStack.pop();
        }
//        theStack.display("End   ");
        return output;
    }

    public void getOper(char opThis, int prec1) {
        while (!theStack.isEmpty()) {
            char opTop = theStack.pop();
            if(opTop == '(') {
                theStack.push(opThis);
                break;
            } else {
                int prec2;
                if(opTop == '+' || opTop == '-') {
                    prec2 = 1;
                } else {
                    prec2 = 2;
                }

                if(prec2 < prec1) {
                    theStack.push(opTop);
                    break;
                } else {
                    output = output + opTop;
                }
            }
        }
        theStack.push(opThis);
    }

    public void getParent(char ch) {
        while (!theStack.isEmpty()) {
            char chx = theStack.pop();
            if(chx == '(') {
                break;
            } else {
                output = output + chx;
            }
        }
    }


}
