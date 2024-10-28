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

    public static <T> LinkedListNode<T> getKthElementToLast (LinkedListNode<T> head, int k){
        LinkedListNode<T> runner = head;
        LinkedListNode<T> otherRunner = head;

        for (int i = 0; i < k; i++) {
            otherRunner = otherRunner.getNext();
        }

        while (otherRunner != null) {
            runner = runner.getNext();
            otherRunner = otherRunner.getNext();
        }

        return runner;
    }

    public class LinkedListNode<T>{
        private T data = null; 
        private LinkedListNode<T> next = null;

        public LinkedListNode(T data, LinkedListNode<T> next) {
            this.data = data;
            this.next = next;
        }

        public LinkedListNode<T> getNext(){
            return next;
        }

        public T getData(){
            return data;
        }
        
    }

}

