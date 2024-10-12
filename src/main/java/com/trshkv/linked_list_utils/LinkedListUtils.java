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
}
