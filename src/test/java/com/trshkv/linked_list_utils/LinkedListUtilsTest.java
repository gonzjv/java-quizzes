package com.trshkv.linked_list_utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.trshkv.linked_list_utils.LinkedListUtils.Node;

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

        Node<Integer> node4 = utils.new Node<Integer>(4, null);
        Node<Integer> node3 = utils.new Node<Integer>(3, node4);
        Node<Integer> node2 = utils.new Node<Integer>(2, node3);
        Node<Integer> node1 = utils.new Node<Integer>(1, node2);

        assertEquals(Integer.valueOf(3), LinkedListUtils.getKthElementToLast(node1, 2).getData()); 
    }
}
