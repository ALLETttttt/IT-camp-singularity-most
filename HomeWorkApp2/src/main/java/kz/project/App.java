package kz.project;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        taskOne();
        System.out.println();

        taskTwo();
        System.out.println();

        taskThree();
        System.out.println();

        taskFour();
        System.out.println();

        taskFive();
        System.out.println();

        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(taskSix(arr));
        int[] ar = {1, 1, 1, 2, 1};
        System.out.println(taskSix(ar));
        System.out.println();

        int[] arrr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many times you want to shift your array: ");
        int n = input.nextInt();
        taskSeven(arrr, n);
    }

    public static void taskOne() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void taskTwo() {
        int[] arr = new int[8];
        int j = 0;
        for (int i = 0; i <= 21; i += 3) {
            arr[j] = i;
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void taskThree() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int i = 0;
        while(i != arr.length) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void taskFour() {
        int[][] arr = new int[9][9];

        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i+j == arr.length-1){
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void taskFive() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = (int) 1e9;
        int max = (int) -1e9;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Array " + Arrays.toString(arr));
        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);
    }

    public static boolean taskSix(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            if (sum - leftSum == leftSum) {
                return true;
            }
        }
        return false;
    }

    public static void taskSeven(int[] arr, int n) {
        if (n == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        n %= arr.length;
        for (int i = 0; i < n; i++) {
            int element = arr[i];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = element;
        }
        System.out.println(Arrays.toString(arr));
    }
}
