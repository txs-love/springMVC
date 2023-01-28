package com.example.java8.lambda;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author txssherry@gmail.com
 * @date 2023/1/15 4:03
 */
public class Test04 {
    @Test
    public void test01(){
        ArrayList<String> array = new ArrayList<>();
        array.add("mark");
        array.add("sherry");
        array.add("老婆");
        array.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        array.forEach(s -> {
            System.out.println(s);
        });
    }

    @Test
    public void test02(){
        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(new User("小明",2));
        arrayList.add(new User("小红",19));
        arrayList.add(new User("小莱",10));
        arrayList.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        arrayList.forEach(s-> System.out.println(
                s.toString()
        ));
    }

    @Test
    public void test03() {
     new Thread(new Runnable() {
         @Override
         public void run() {
             System.out.println("xxx "+Thread.currentThread().getName()+" 线程");
         }
     }).start();
     new Thread(()-> System.out.println("xxx "+Thread.currentThread().getName()+" 线程")).start();
    }

}
