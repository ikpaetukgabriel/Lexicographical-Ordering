package com.gabrielikpaetuk;

import java.util.Arrays;
import java.util.List;

public class LexicographicalComparer {
    /***
     * Sort two strings lexicographically
     * @param strParamA
     * @param strParamB
     * @return
     */
    public static List<String> getTheLexOrderOfTwoStrings(String strParamA, String strParamB) {
        // Checks if the strings are the same : returns a list with no preferred order
        if (strParamA.equals(strParamB)) return Arrays.asList(strParamA, strParamB);

        // Checks the first parameter is an empty string : returns the empty string as the first
        if (strParamA.length() < 1) return Arrays.asList(strParamA, strParamB);

        // Checks the second parameter is an empty string : returns the empty string as the first
        if (strParamB.length() < 1) return Arrays.asList(strParamB, strParamA);

        int smallestStrLen = getSmallestLengthOfTwoStrings(strParamA, strParamB);

        for (int i = 0; i < smallestStrLen; i++) {
            if (strParamA.charAt(i) < strParamB.charAt(i)) {
                return Arrays.asList(strParamA, strParamB);
            }
            if (strParamB.charAt(i) < strParamA.charAt(i)) {
                return Arrays.asList(strParamB, strParamA);
            }
        }
        return getSmallestStringAsFirstItem(strParamA, strParamB);
    }

    private static int getSmallestLengthOfTwoStrings(String firstString, String secondString) {
        return Math.min(firstString.length(), secondString.length());
    }

    private static List<String> getSmallestStringAsFirstItem(String firstString, String secondString) {
        return firstString.length() < secondString.length() ?
                Arrays.asList(firstString, secondString) :
                Arrays.asList(secondString, firstString);
    }

    // Sort a list of strings lexicographically
}
