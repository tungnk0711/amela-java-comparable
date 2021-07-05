package com.codegym;

public class Simpson implements Comparable<Simpson>{
    String name;
    int age;

    Simpson(String name){
        this.name = name;
    }

    Simpson(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Simpson simpson){
        return this.name.compareTo(simpson.name);
        //return this.age - simpson.age;
        //return 9;
    }
}
