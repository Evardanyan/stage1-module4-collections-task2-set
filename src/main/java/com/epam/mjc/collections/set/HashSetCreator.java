package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();

        for (Integer x : sourceList) {
            result.add(x);
            if (x % 2 == 0) {
                int i = x;
                while (i % 2 == 0) {
                    i /= 2;
                    result.add(i);
                }
            } else {
                result.add(x * 2);
            }
        }

        return result;
    }
}
