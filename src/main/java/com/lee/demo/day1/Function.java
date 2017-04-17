package com.lee.demo.day1;

import java.util.Random;

/**
 * Created by jackl on 2017.4.15.
 */
public interface Function<T,U,R> {
    R apply(T t,U u);
}

class FunctionTest{

    public static <T,U, R> R fun(T t,U u,
                                    Function<T, U,R> f) {
        return f.apply(t,u);
    }

    public static void main(String[] args) {
        Random r = new Random(System.currentTimeMillis());
       Integer integer1 = r.nextInt(100);
       Integer integer2 = r.nextInt(100);

        System.out.println(fun(integer1,integer2,(Integer a,Integer b)->a+b));
        System.out.println(fun(integer1,integer2,(Integer a,Integer b)->a-b));
        System.out.println(fun(integer1,integer2,(Integer a,Integer b)->a*b));
        System.out.println(fun(integer1,integer2,(Integer a,Integer b)->a/b));
        System.out.println(fun(integer1,integer2,(Integer a,Integer b)->a>b?a:b));
        System.out.println("a="+integer1+","+"b="+integer2);
    }
}