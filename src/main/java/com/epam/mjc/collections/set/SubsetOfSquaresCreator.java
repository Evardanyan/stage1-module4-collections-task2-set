package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> ns = new TreeSet<>();

        for (Integer x: sourceList) {
            ns.add(x * x);
        }

        return ns.subSet(lowerBound, upperBound + 1);
    }
}
