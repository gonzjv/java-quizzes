package com.trshkv.linked_list_utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.trshkv.linked_list_utils.LinkedListUtils.LinkedListNode;

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

    @Test
    public void shouldReturnKthElemToLast() {
        LinkedListUtils utils = new LinkedListUtils();

        LinkedListNode<Integer> node4 = utils.new LinkedListNode<Integer>(4, null);
        LinkedListNode<Integer> node3 = utils.new LinkedListNode<Integer>(3, node4);
        LinkedListNode<Integer> node2 = utils.new LinkedListNode<Integer>(2, node3);
        LinkedListNode<Integer> node1 = utils.new LinkedListNode<Integer>(1, node2);

        assertEquals(Integer.valueOf(3), LinkedListUtils.getKthElementToLast(node1, 2).getData()); 
    }
}
