package ru.learnJava;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.zip.DeflaterOutputStream;

public class Tasks {

    public static int sum(List<?> mixed) {
        return mixed.stream().mapToInt(o -> Integer.parseInt(String.valueOf(o))).sum();
    }

    public static int[] monkeyCount(final int n){
        return IntStream.rangeClosed(1, n).toArray();
    }

    public static String bonusTime(final int salary, final boolean bonus) {
        return "\u00A3" + (bonus ? salary * 10 : salary);
    }

    public static boolean isDigit(String s) {
        return s.matches("\\d+");
    }

    public static int sumOfDifferences(int[] arr) {
        Arrays.sort(arr);
        int result = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            result += (arr[i] - arr[i + 1]);
        }
        return result;
    }

    public static String reverseString(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static int[] mergeArrays(int[] first, int[] second) {
//        List<Integer> integers = new ArrayList<>();
//        for (int x: first) {
//            integers.add(x);
//        }
//
//        for (int x: second) {
//            integers.add(x);
//        }
//        return integers.stream().mapToInt(integer -> integer.intValue()).distinct().sorted().toArray();
        return IntStream.concat(IntStream.of(first), IntStream.of(second)).distinct().sorted().toArray();
    }

    public static String well(String[] x) {
        long goodCount = Arrays.stream(x).filter(s -> s.equals("good")).count();
        if(goodCount > 2) {
            return "I smell a series!";
        } else if(goodCount > 0) {
            return "Publish!";
        } else {
            return "Fail!";
        }
    }

    static String noSpace(final String x) {
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < x.length(); i++) {
//            if(!(x.charAt(i) == ' ')) {
//                builder.append(x.charAt(i));
//            }
//        }
//        return builder.toString();
        return x.replace(" ", "");
    }

    public static String howMuchILoveYou(int nb_petals) {
        Stack<String> strings = getHowMuchLoveStack();
        String result = "";
        for (int i = 0; i < nb_petals; i++) {
            if (!strings.isEmpty()) {
                result = strings.pop();
            } else {
                strings = getHowMuchLoveStack();
                result = strings.pop();
            }
        }
        return result;
    }

    private static Stack<String> getHowMuchLoveStack() {
        Stack<String> strings = new Stack<>();
        strings.push("not at all");
        strings.push("madly");
        strings.push("passionately");
        strings.push("a lot");
        strings.push("a little");
        strings.push("I love you");
        return strings;
    }

    public static String bmi(double weight, double height) {
        double bmi = weight / Math.pow(height, 2);
        String result = "";
        if (bmi <= 18.5) {
            result = "Underweight";
        } else if (bmi <= 25) {
            result = "Normal";
        } else if (bmi <= 30) {
            result = "Overweight";
        } else if (bmi >= 30) {
            result = "Obese";
        }
        return result;
    }

    public static double squareArea(double A){
        Double result = Math.pow(2 * A / Math.PI, 2);
        return new BigDecimal(result).setScale(2, RoundingMode.DOWN).doubleValue();
    }

    public static String[] stringToArray(String s) {
        return s.split(" ");
    }

    public static int[] take(int[] arr, int n) {
        return n > arr.length ? Arrays.copyOfRange(arr, 0, arr.length) : Arrays.copyOfRange(arr, 0, n);
    }

    public static String describeAge(int age) {
        return "You're a(n) " + (age <= 12 ? "kid" : age <= 17 ? "teenager" : age <= 64 ? "adult" : "elderly");
    }

    public static String howManyDalmatians(int number) {
        return number <= 10 ? "Hardly any" :
               number <= 50 ? "More than a handful!" :
               number == 101 ? "101 DALMATIANS!!!" : "Woah that's a lot of dogs!";
    }

    public static String integrate(int coefficient, int exponent) {
        return (coefficient /= ++exponent) + "x^" + exponent;
    }

    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static String[] fixTheMeerkat(String[] arr) {
        return null;
    }

    public static void matrix(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }


}
