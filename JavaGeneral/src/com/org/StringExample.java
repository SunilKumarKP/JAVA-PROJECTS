package com.org;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExample {

    public static void main(String[] args) {
        String s = "abc-12 abcd  as ";
        Pattern p = Pattern.compile("-\\d+");
        Matcher m = p.matcher(s);
        int count = 0;
        while (m.find()) {
            count++;
        }
        System.out.println("value==>" + count);

    }
}