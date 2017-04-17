package com.lee.demo.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jackl on 2017.4.15.
 */
@FunctionalInterface
public interface Predicate<T> {
    Boolean test(T t);
}

class PredicateTest {
    public static <T> List<T> pre(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for(T s: list){
            if(p.test(s)){
                results.add(s);
            }
        }
        return results;
    }

    public static void main(String[] args) {
        Predicate<Student> predicate = (Student student)->student.getAge()>50;
        Predicate<Student> predicate2 = (Student student)->student.getName().contains("3");
        List<Student> list = new ArrayList<>();
        Student student;
        Random r = new Random(System.currentTimeMillis());
        for (int i = 0;i<15;i++){
            student = new Student(String.valueOf("name"+i),String.valueOf("addr"+i),r.nextInt(100)+1);
            list.add(student);
        }

        List<Student> list1 = pre(list,predicate);
        List<Student> list2 = pre(list,predicate2);

        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);
    }
}