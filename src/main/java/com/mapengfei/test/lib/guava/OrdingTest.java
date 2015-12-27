package com.mapengfei.test.lib.guava;

import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;

/**
 * Created by mapengfei on 15/12/27.
 */
public class OrdingTest {
    public static void main(String[] args) {
        Ordering<String> byLengthOrdering = new Ordering<String>() {
            public int compare(String left, String right) {
                return Ints.compare(left.length(), right.length());
            }
        };
    }
}
