package com.gabrielikpaetuk;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<String> orderOfTwoStrings = LexicographicalComparer
                .getTheLexOrderOfTwoStrings("Camilla", "Aaron");
        System.out.println(orderOfTwoStrings);
    }
}
