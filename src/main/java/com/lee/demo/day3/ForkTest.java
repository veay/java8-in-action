package com.lee.demo.day3;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.LongStream;

/**
 * Created by jack on 2017/4/17.
 */
public class ForkTest {
    public static long forkJoinSum(long n) {
        long[] numbers = LongStream.rangeClosed(1, n).toArray();
        ForkJoinTask<Long> task = new ForkJoinSumCalculator(numbers);
        return new ForkJoinPool().invoke(task);
    }

    public static void main(String[] args) {
       Long s =  forkJoinSum(100);
        System.out.println(s);
    }
}
