package com.org.programming;

public class StringPermutation {
    public static void main(String[] args) {
        permutation("ABCDXYZ");
    }

    public static void permutation(String word) {
        permutation("", word);
    }

    private static void permutation(String perm, String word) {
        // TODO Auto-generated method stub
        if (word.isEmpty()) {
            System.out.println(perm + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));

            }
        }
    }
}
