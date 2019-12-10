package ru.learnJava;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void checkBrackets() {
        assertEquals("good", Solution.checkBrackets("a+(b+c)"));
    }
}