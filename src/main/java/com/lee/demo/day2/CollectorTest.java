package com.lee.demo.day2;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * Created by jackl on 2017.4.16.
 */
public class CollectorTest {
    public Map<Boolean, List<Integer>>
    partitionPrimesWithCustomCollector(int n) {
        return IntStream.rangeClosed(2, n).boxed()
                .collect(new PrimeNumbersCollector());
    }

    public static void main(String[] args) {
        CollectorTest collectorTest = new CollectorTest();
        Map<Boolean,List<Integer>> map = collectorTest.partitionPrimesWithCustomCollector(20);
        System.out.println(map);
    }
}
