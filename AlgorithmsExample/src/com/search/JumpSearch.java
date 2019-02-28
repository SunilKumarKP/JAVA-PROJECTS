package com.search;

public class JumpSearch {

    static int jumpSearch(int[] array, int value) {
        System.out.println("inside jump search");
        int n = array.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;
        while (array[Math.min(step, n) - 1] < value) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) {
                return -1;
            }
        }
        while (array[prev] < value) {
            prev++;
            if (prev == Math.min(step, n))
                return -1;
        }
        // If element is found
        if (array[prev] == value)
            return prev;
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610 };
        int x = 55;

        // Find the index of 'x' using Jump Search
        int index = jumpSearch(arr, x);

        // Print the index where 'x' is located
        System.out.println("\nNumber " + x + " is at index " + index);
    }
}
