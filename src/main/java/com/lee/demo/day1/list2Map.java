package com.lee.demo.day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.IntStream;

/**
 * Created by jackl on 2017.4.15.
 */
class list2Map{

    public static void main(String[] args) {
        Function<String,List<String>> function = (String type)->{
            List<String> list = new ArrayList<>();
            IntStream.range(0,10).forEach(i->list.add(type+""+i));
            return list;
        };
        BiFunction<List<String>,List<String>,Map<String,String>>
                biFunction = (keyList, valueList)-> new HashMap<String,String>(){
            {
                    for (int i =0;i<keyList.size();i++){
                        put(keyList.get(i),valueList.get(i));
                    }
            }
        };

        Map<String,String> map = biFunction.apply(function.apply("key"),function.apply("value"));
        System.out.println(map);
    }
}
