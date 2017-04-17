package com.lee.demo.day2;

import com.lee.demo.day1.Student;

import java.util.*;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
/**
 * Created by jackl on 2017.4.15.
 */
public class Stream {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student student;
        Random r = new Random(System.currentTimeMillis());
        for (int i = 0;i<15;i++){
            student = new Student(String.valueOf("name"+i),String.valueOf("addr"+i),r.nextInt(100)+1);
            list.add(student);
        }
        //并行流
        List<Student> list1 =  list.parallelStream().filter((s)-> s.getAge()>50).collect(toList());
        List<Student> list2 =  list.stream().filter((s)-> s.getAge()>50).collect(toList());
        Collections.sort(list, comparing(Student::getAge));
        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);
    }

}
