package com.company;

import java.util.ArrayList;

public class Main2 {    //mijin tvabanakan
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int sum = numbers.stream().mapToInt(n -> n).sum();
        System.out.println("Mean = " + sum/numbers.size());
    }
}