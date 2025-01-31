package com.trshkv.linked_list_utils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LinkedListUtils {
    public static <E> List<E> removeDuplicates(List<E> list) {
        Set<E> set = new HashSet<>();
        Iterator<E> iterator = list.iterator();

        while (iterator.hasNext()) {
            E current = iterator.next();
            
            if (set.contains(current)) {
                iterator.remove();
            } else {
                set.add(current);
            };
        };

        return list;
    }

    public static <T> Node<T> getKthElementToLast (Node<T> head, int k){
        Node<T> runner = head;
        Node<T> otherRunner = head;

        for (int i = 0; i < k; i++) {
            otherRunner = otherRunner.getNext();
        }

        while (otherRunner != null) {
            runner = runner.getNext();
            otherRunner = otherRunner.getNext();
        }

        return runner;
    }

    public class Node<T>{
        private T data = null; 
        private Node<T> next = null;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public Node<T> getNext(){
            return next;
        }

        public T getData(){
            return data;
        }
        
    }

    public Node<Integer> partition (Node<Integer> head, int value){
        return null;
    }

    private void moveGreateAndEqualsNodes (Node<Integer> head,
     Node<Integer> otherHead, int val) {
        Node<Integer> runner = head;

        while(null != runner) {
            if (runner.getData() >= Integer.valueOf(val)) {
                Node newNode = new Node<Integer>(runner.getData(), otherHead.next);
                

            }
        }
    }
}

