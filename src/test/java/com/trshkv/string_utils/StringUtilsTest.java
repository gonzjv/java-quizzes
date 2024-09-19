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
}
