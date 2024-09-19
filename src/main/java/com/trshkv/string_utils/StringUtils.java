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
}
