package ru.learnJava;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class TasksTest {

    @Test
    public void sum() {
        assertEquals(12, Tasks.sum(Arrays.asList(1, "10", 1)));
    }

    @Test
    public void monkeyCount() {
        int[] result =  {1, 2, 3};
        assertArrayEquals(result, Tasks.monkeyCount(3));
    }

    @Test
    public void bonusTime() {
        assertEquals("£" + 20, Tasks.bonusTime(2, true));
    }

    @Test
    public void isDigit() {
        assertFalse(Tasks.isDigit(""));
        assertFalse(Tasks.isDigit(" "));
        assertFalse(Tasks.isDigit("a"));
        assertFalse(Tasks.isDigit("aa5"));
        assertTrue((Tasks.isDigit("2")));
        assertTrue((Tasks.isDigit("0")));
        assertTrue((Tasks.isDigit("22")));
    }

    @Test
    public void sumOfDifferences() {
        assertEquals(-9, Tasks.sumOfDifferences(new int[]{1, 2, 10}));
        assertEquals(-2, Tasks.sumOfDifferences(new int[]{-3, -2, -1}));
        assertEquals(0, Tasks.sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
        assertEquals(-34, Tasks.sumOfDifferences(new int[]{-17, 17}));
        assertEquals(0, Tasks.sumOfDifferences(new int[0]));
        assertEquals(0, Tasks.sumOfDifferences(new int[]{0}));
        assertEquals(0, Tasks.sumOfDifferences(new int[]{-1}));
        assertEquals(0, Tasks.sumOfDifferences(new int[]{1}));
    }

    @Test
    public void reverseString() {
        assertEquals("dlrow", Tasks.reverseString("world"));
    }

    @Test
    public void mergeArrays() {
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, Tasks.mergeArrays(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 }));
        assertArrayEquals(new int[] { 2, 4, 6, 8 }, Tasks.mergeArrays(new int[] { 2, 4, 8 }, new int[] { 2, 4, 6 }));
        assertArrayEquals(new int[] { }, Tasks.mergeArrays(new int[] { }, new int[] { }));
        assertArrayEquals(new int[] { 2, 4, 6, 8 }, Tasks.mergeArrays(new int[] { 2, 4, 8 }, new int[] { 2, 4, 6 }));
    }

    @Test
    public void well() {
        assertEquals("Fail!", Tasks.well(new String[] {"bad", "bad", "bad"}));
        assertEquals("Publish!", Tasks.well(new String[] {"good", "bad", "bad", "bad", "bad"}));
        assertEquals("I smell a series!", Tasks.well(new String[] {
                "good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));
    }

    @Test
    public void noSpace() {
        assertEquals("8j8mBliB8gimjB8B8jlB", Tasks.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", Tasks.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", Tasks.noSpace("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", Tasks.noSpace("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", Tasks.noSpace("8j aam"));
    }

    @Test
    public void howMuchILoveYou() {
        assertEquals("I love you", Tasks.howMuchILoveYou(1));
        assertEquals("a little", Tasks.howMuchILoveYou(2));
        assertEquals("not at all", Tasks.howMuchILoveYou(6));
    }

    @Test
    public void bmi() {
        assertEquals("Normal", Tasks.bmi(80, 1.80));
    }

    private static final double DELTA = 1e-15;
    @Test
    public void squareArea() {
        assertEquals(1.62, Tasks.squareArea(2),DELTA);
        assertEquals(0, Tasks.squareArea(0),DELTA);
        assertEquals(80, Tasks.squareArea(14.05),DELTA);
    }

    @Test
    public void stringToArray() {
        assertArrayEquals(new String[]{"Robin", "Singh"}, Tasks.stringToArray("Robin Singh"));
    }

    @Test
    public void take() {
        assertArrayEquals(new int[] {1, 2, 3}, Tasks.take(new int[] {1, 2, 3, 4, 5, 6}, 3));
        assertArrayEquals(new int[] {1, 2}, Tasks.take(new int[] {1, 2, 3, 4, 5, 6}, 2));
        assertArrayEquals(new int[] {1, 2, 3}, Tasks.take(new int[] {1, 2, 3}, 4));
        assertArrayEquals(new int[] { }, Tasks.take(new int[] { }, 0));
        assertArrayEquals(new int[] { }, Tasks.take(new int[] { }, 3));
    }

    @Test
    public void howManyDalmatians() {
        assertEquals("More than a handful!",Tasks.howManyDalmatians(26));
        assertEquals("Hardly any" ,Tasks.howManyDalmatians(8));
        assertEquals("More than a handful!" ,Tasks.howManyDalmatians(14));
        assertEquals("Woah that's a lot of dogs!" ,Tasks.howManyDalmatians(80));
        assertEquals("Woah that's a lot of dogs!" ,Tasks.howManyDalmatians(100));
        assertEquals("101 DALMATIANS!!!" ,Tasks.howManyDalmatians(101));
    }

    @Test
    public void integrate() {
        assertEquals("1x^3", Tasks.integrate(3,2));
        assertEquals("2x^6", Tasks.integrate(12,5));
        assertEquals("10x^2", Tasks.integrate(20,1));
        assertEquals("10x^4", Tasks.integrate(40,3));
        assertEquals("30x^3", Tasks.integrate(90,2));
    }

    @Test
    public void remove() {
        assertEquals("loquen", Tasks.remove("eloquent"));
        assertEquals("ountr", Tasks.remove("country"));
        assertEquals("erso", Tasks.remove("person"));
        assertEquals("lac", Tasks.remove("place"));
    }

    @Test
    public void fixTheMeerkat() {
        assertArrayEquals(new String[]{ "head", "body", "tail" }, Tasks.fixTheMeerkat(new String[]{ "tail", "body", "head" }));
    }


}