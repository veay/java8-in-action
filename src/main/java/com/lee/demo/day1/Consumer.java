package com.lee.demo.day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jackl on 2017.4.15.
 */
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t,T t2);
}

class ConsumerTest {

    public static <T> void con(List<T> list,List<T> list2,
                               Consumer<T> f) {
        for (int i = 0;i< list.size();i++){
            f.accept(list.get(i),list2.get(i));
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        Consumer<String> function = (String key,String value)-> map.put(key,value);
        for (int i = 0;i<10;i++){
            list.add("key"+i);
            list2.add("value"+i);
        }
        con(list,list2,function);
        System.out.println(map);
    }
}
