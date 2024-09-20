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
}
