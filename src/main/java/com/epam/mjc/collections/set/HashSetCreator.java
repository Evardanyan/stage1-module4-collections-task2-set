package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < sourceList.size(); i++) {
            if (sourceList.get(i) % 2 == 0) {
                result.add(sourceList.get(i));
                result.add(sourceList.get(i) / 2);
            } else {
                result.add(sourceList.get(i));
                result.add(sourceList.get(i) * 2);
            }
        }
        return result;
    }
}
