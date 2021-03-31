package com.company;

import java.util.ArrayList;

public class Main1 {                      //Palindrome or not
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Barcelona");
        strings.add("radar");
        strings.add("blah");
        strings.add("Vagho");

        strings.forEach((n) -> {
                    String temp = n;
                    String empty = "";
                    for (int i = n.length() - 1; i >= 0; i--) {
                        empty = empty + n.charAt(i);
                    }
                    if (temp.equals(empty)) {
                        System.out.println(temp + " Is palindrome.");
                    } else {
                        System.out.println(temp + " Is not palindrome.");
                    }
                }
        );
    }
}