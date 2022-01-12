package com.gabrielikpaetuk;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<String> orderOfTwoStrings = getTheLexOrderOfTwoStrings("Camilla", "Aaron");
        System.out.println(orderOfTwoStrings);
    }

    /**
     * Sort two strings lexicographically
     *
     * @param strParamA
     * @param strParamB
     * @return List of ordered strings
     */
    public static List<String> getTheLexOrderOfTwoStrings(String strParamA, String strParamB) {

        // Checks if the strings are the same : returns a list with no preferred order
        if (strParamA.equals(strParamB)) {
            return Arrays.asList(strParamA, strParamB);
        }

        // Checks the first parameter is an empty string : returns the empty string as the first
        if (strParamA.length() < 1) {
            return Arrays.asList(strParamA, strParamB);
        }

        // Checks the second parameter is an empty string : returns the empty string as the first
        if (strParamB.length() < 1) {
            return Arrays.asList(strParamB, strParamA);
        }

        // Gets the smallest length of the two string parameters
        int smallestStrLen = Math.min(strParamA.length(), strParamB.length());

        for (int i = 0; i < smallestStrLen; i++) {

            if (strParamA.charAt(i) < strParamB.charAt(i)) {
                return Arrays.asList(strParamA, strParamB);
            }

            if (strParamB.charAt(i) < strParamA.charAt(i)) {
                return Arrays.asList(strParamB, strParamA);
            }
        }

        // Returns the smallest string as the first item in the list
        return strParamA.length() < strParamB.length() ?
                Arrays.asList(strParamA, strParamB) :
                Arrays.asList(strParamB, strParamA);
    }


    // Sort a list of strings lexicographically
}
