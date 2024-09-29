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

    public static String compressString(String str) {
        char[] arr = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        char current = arr[0];
        int count = 0;

        for (int i = 0; i < arr.length; ++i){
            while (i < arr.length && current == arr[i]) {
                count++;
                i++;
            }

            builder.append(current);
            builder.append(count);
            count = 1;

            if (i < arr.length) {
                current = arr[i];
            }
        }

        String resultStr = builder.toString();
        
        if (resultStr.length() >= str.length()) {
            return str;
        }

        return resultStr;
    }

    public static  String compressStringImproved(String str){
        int count = 0;
        StringBuilder builder = new StringBuilder();
        String resultStr = null;

        for (int i = 0; i < str.length(); i++) {
            count++;

            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                builder.append(str.charAt(i));
                builder.append(count);
                count = 0;
            }
        }

        resultStr = builder.toString();
        return resultStr.length() < str.length() ? resultStr : str;
    }
}
