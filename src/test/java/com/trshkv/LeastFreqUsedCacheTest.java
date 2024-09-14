package com.trshkv;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.trshkv.least_freq_cache.LeastFreqUsedCache;

public class LeastFreqUsedCacheTest {
    @Test
    public void shouldReplaceLeastFreqElem() {
        LeastFreqUsedCache<Integer, String> cache = new LeastFreqUsedCache<>(3);

        cache.put(1, "first");
        cache.put(2, "second");
        cache.put(3, "third");
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        cache.put(4, "forth");

        assertEquals(null, cache.get(2));
        assertEquals("first", cache.get(1));
        assertEquals("third", cache.get(3));
        assertEquals("forth", cache.get(4));
    }
}
