package com.trshkv.string_utils;

import java.util.HashSet;

public class StringUtils {
    public static boolean IsUnique(String str) {
        HashSet<Character> set = new HashSet<>(); 
        for (char c : str.toCharArray()) {
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }

        return true;
    }

    public static boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] letters = new int[128];

        for (char c : str1.toCharArray()) {
            letters[c]++;
        }

        for (char c : str2.toCharArray()) {
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkOneAwayEdit(String str, String otherStr) {
        if (str.length() == otherStr.length()) {
            return checkOneEditReplace(str, otherStr);
        } else if (str.length() + 1 == otherStr.length()){
            return checkOneEditInsert(str, otherStr);
        } else if (str.length() == otherStr.length() + 1){
            return checkOneEditInsert(otherStr, str);
        }
        return false;
    }

    private static boolean checkOneEditReplace(String str, String otherStr) {
        boolean foundChange = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != otherStr.charAt(i)) {
                if (true == foundChange) {
                    return false;
                }

                foundChange = true;
            }
        }

        return true;
    }

    private static boolean checkOneEditInsert(String str, String longerStr) {
        int ind = 0;
        int longerInd = 0;

        while (ind < str.length() && longerInd < longerStr.length()) {
            if (str.charAt(ind) != longerStr.charAt(longerInd)) {
                
                if (ind != longerInd) {
                    return false;
                }
                
                longerInd++;
            }

            ind++;
            longerInd++;
        }

        return true;
    }
}
