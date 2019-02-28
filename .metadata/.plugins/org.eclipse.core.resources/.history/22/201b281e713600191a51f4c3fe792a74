package com.search;

public class LinearSearch {

    public static int search(int[] array, int x) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;

        int result = search(arr, x);
        if (result == -1) {
            System.out.print("Element is not present in array");
        } else {
            System.out.println("Element is present at index " + result);
        }
    }
}
