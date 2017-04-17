package com.lee.demo.day2;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by jackl on 2017.4.16.
 */
public class Stream1 {

    public static void main(String[] args) {
        Stream<double[]> pythagoreanTriples =
                IntStream.rangeClosed(1, 100).boxed()
                        .flatMap(a ->
                                IntStream.rangeClosed(a, 100)
                                        .mapToObj(
                                                b -> new double[]{a, b, Math.sqrt(a*a + b*b)})
                                        .filter(t -> t[2] % 1 == 0));
        pythagoreanTriples.limit(5)
                .forEach(t ->
                        System.out.println(t[0] + ", " + t[1] + ", " + t[2]));

        Stream.iterate(new int[]{0, 1},
                t -> new int[]{t[1],t[0] + t[1]})
                .limit(10)
                .map(t -> t[0]+" ")
                .forEach(System.out::print);
    }
}
