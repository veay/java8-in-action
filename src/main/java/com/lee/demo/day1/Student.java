package com.lee.demo.day1;

/**
 * Created by jackl on 2017.4.15.
 */
public class Student {

    public Student(String name,String address,int age){
        this.address = address;
        this.age = age;
        this.name = name;
    }

    private String name ;

    private String address ;

    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
