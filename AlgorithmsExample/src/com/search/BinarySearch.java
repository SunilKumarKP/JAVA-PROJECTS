package com.search;

/**
 * Searching against Sorted array.
 *
 *
 */
public class BinarySearch {

    static int binarySearch(int[] array, int start, int end, int value) {
        if (end > start) {
            int mid = start + (end - 1) / 2;
            if (array[mid] == value) {
                return mid;
            }

            // value less than mid element search in first half
            if (array[mid] > value) {
                return binarySearch(array, start, mid - 1, value);
            }

            // value greater than mid element search in second half
            if (array[mid] < value) {
                return binarySearch(array, mid + 1, end, value);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int array[] = { 2, 3, 4, 10, 40 };
        int n = array.length;
        int x = 10;
        int result = binarySearch(array, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }

}
