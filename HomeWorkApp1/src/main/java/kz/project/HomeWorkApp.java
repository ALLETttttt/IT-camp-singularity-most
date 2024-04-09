package kz.project;

import java.util.Scanner;

/**
 * Homework App #01!
 *
 */
public class HomeWorkApp
{
    public static void main( String[] args )
    {
        printThreeWords();
        System.out.println(checkSumSign());
        printColor();
        System.out.println(compareNumbers());
    }

    public static Scanner getInput() {
        return new Scanner(System.in);
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static String checkSumSign() {
        return getInput().nextInt() + getInput().nextInt() >= 0
                ? "positive number" : "negative number";
    }

    public static void printColor() {
        int a = getInput().nextInt();

        if(a <= 0) System.out.println("Red");
        else if (a <= 100) System.out.println("Yellow");
        else System.out.println("Green");
    }

    public static String compareNumbers() {
        int a = getInput().nextInt();
        int b = getInput().nextInt();
        return (a >= b) ? "a >= b" : "a < b";
    }
}
