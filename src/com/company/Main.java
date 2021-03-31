package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(34);
        numbers.add(13);
        numbers.add(8);
        numbers.add(9);

        numbers.forEach((n) -> {
                    if (n % 2 == 0) {
                        System.out.println(n + " is even");
                    } else {
                        System.out.println(n + " is odd");
                    }
                }
        );
    }
}
