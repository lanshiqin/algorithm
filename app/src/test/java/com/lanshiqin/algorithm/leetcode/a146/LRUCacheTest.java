package com.lanshiqin.algorithm.leetcode.a146;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUCacheTest {

    private LRUCache lruCache;

    @BeforeEach
    void setUp() {
        lruCache = new LRUCache(3);
    }

    @Test
    void test1() {
        lruCache.put(1,1);
        lruCache.put(2,2);
        lruCache.put(3,3);
        assertEquals(1,lruCache.get(1));
        lruCache.put(4,4);
        assertEquals(-1,lruCache.get(2));
        lruCache.put(1,111);
        assertEquals(111,lruCache.get(1));
        assertEquals(4,lruCache.get(4));
        assertEquals(3,lruCache.get(3));
    }

}