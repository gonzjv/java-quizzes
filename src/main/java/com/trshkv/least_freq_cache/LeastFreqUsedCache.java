package com.trshkv.least_freq_cache;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

public class LeastFreqUsedCache<K,V> {
    private Map<K,V> map = null;
    private Map<K, Integer> freqMap = null;
    private Map<Integer, LinkedHashSet<K>> freqListMap = null; 
    private int size = 0;
    private int capacity = 0;
    private int leastFreq = 1;

    public LeastFreqUsedCache() {
        map = new HashMap<>();
        freqMap = new HashMap<>();
        freqListMap = new HashMap<>();
        freqListMap.put(1, new LinkedHashSet<>());
    }

    public void put (K key, V value) {
        if (map.containsKey(key)) {
            Integer freq = freqMap.get(key);
            map.put(key, value);
            freqMap.put(key, freq + 1);
            freqListMap.get(freq).remove(key);

            if (freqListMap.containsKey(freq + 1) == false) {
                LinkedHashSet<K> set = new LinkedHashSet<>();
                set.add(key);
                freqListMap.put(freq, set);
            }
        } else {
            if (size == capacity) {
                K lastElem = null;
                Iterator<K> iterator = freqListMap.get(leastFreq).iterator();
                
                while (iterator.hasNext()) {
                    lastElem = iterator.next();
                }
                
                map.remove(lastElem);
                freqMap.remove(lastElem);
                iterator.remove();
            }

            map.put(key, value);
            freqMap.put(key, 1);
            freqListMap.get(1).add(key);

        }

    }

    public V get(K key) {
        if (map.containsKey(key) == false) {
            return null;
        } else {
            Integer freq = freqMap.get(key);
            LinkedHashSet<K> currSet = freqListMap.get(freq);
            freqMap.put(key, freq + 1);
            currSet.remove(key);

            if (freq == leastFreq && currSet.isEmpty()) {
                leastFreq++;
            }

            if (freqListMap.containsKey(freq + 1) == false) {
                LinkedHashSet<K> set = new LinkedHashSet<>();
                freqListMap.put(freq + 1, set);
                set.add(key);
            }
        }

        return map.get(key);
    }

}
