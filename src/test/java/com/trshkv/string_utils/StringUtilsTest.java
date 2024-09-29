package com.trshkv.string_utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    public static void main(String[] args) {
        
    }

    @Test
    public void shouldBeUnique() {
        assertEquals(true, StringUtils.IsUnique("abcd"));
    }

    @Test
    public void shouldNotBeUnique() {
        assertEquals(false, StringUtils.IsUnique("abba"));
    }

    @Test
    public void shouldBePermutation() {
        assertEquals(true, StringUtils.isPermutation("abcd", "bcda"));
    }

    @Test
    public void shouldBePermutationSec() {
        assertEquals(true, StringUtils.isPermutation("football", "ballfoot"));
    }

    @Test
    public void shouldNotBePermutation() {
        assertEquals(false, StringUtils.isPermutation("abcd", "bcdaaa"));
    }

    @Test
    public void shouldBeOneAwayEdited() {
        assertEquals(true, StringUtils.checkOneAwayEdit("perl","berl"));        assertEquals(true, StringUtils.checkOneAwayEdit("perl","pearl"));
        assertEquals(true, StringUtils.checkOneAwayEdit("perl","perla"));
        assertEquals(false, StringUtils.checkOneAwayEdit("perl","berla"));
    }
}
