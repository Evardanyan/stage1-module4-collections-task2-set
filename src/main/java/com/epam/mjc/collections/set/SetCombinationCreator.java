package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new HashSet<>();

        for (String x: firstSet) {
            if (secondSet.contains(x)) {
                result.add(x);
            }
        }

        thirdSet.removeAll(firstSet);
        thirdSet.removeAll(secondSet);

        result.addAll(thirdSet);

        return result;
    }
}
