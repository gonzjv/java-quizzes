package com.trshkv.linked_list_utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class LinkedListUtilsTest {
    
    @Test
    public void shouldRemoveDuplicates() {
        List<Integer> list = new LinkedList<>();
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        list.add(Integer.valueOf(3));
        list.add(Integer.valueOf(3));
        
        LinkedListUtils.removeDuplicates(list);
        
        assertEquals(Integer.valueOf(1), list.get(0));
        assertEquals(Integer.valueOf(2), list.get(1));
        assertEquals(Integer.valueOf(3), list.get(2));
    }
}
