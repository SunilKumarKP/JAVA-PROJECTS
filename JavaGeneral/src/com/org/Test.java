package com.org;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(0, 1, 2, 4, 5, 6);
        int n = array.size();
        int expected = (n) * (n + 1) / 2;
        int sum = 0;
        for (Integer s : array) {
            sum += s;
        }
        System.out.println("Missing element" + (expected - sum));
    }
}
