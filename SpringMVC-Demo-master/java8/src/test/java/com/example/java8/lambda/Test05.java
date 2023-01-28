package com.example.java8.lambda;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * @author txssherry@gmail.com
 * @date 2023/1/15 10:28
 */
public class Test05 {
    @Test
    public void test01(){
        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(new User("小明",2));
        arrayList.add(new User("小莱",10));
        User user = new User("小红", 19);
        arrayList.add(user);
        arrayList.add(user);
        /**
         * 创建stream流
         * 1、串行流Steam
         * 2、并行流
         */
        Stream<User> stream = arrayList.stream();
        Set<User> userSet = stream.collect(Collectors.toSet());
        userSet.forEach(arrayList1-> System.out.println(arrayList1));
        System.out.println("xxxxxxxxxxxx");
        arrayList.parallelStream();
    }

    /**
     * 一个是运算符，一个是方法。 ==：如果比较的对象是基本数据类型，则比较数值是否相等；
     *                       如果比较的是引用数据类型，则比较的是对象的地址是否相等。
     * equals()：用来比较两个对象的内容是否相等。
     */
    @Test
    public void test02() {
        User user = new User("小菜", 29);
        User user1 = new User("小菜", 29);
        System.out.println(user==user1);
        System.out.println(user.equals(user1));
    }

    @Test
    public void test03() {
        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(new User("小明",2));
        arrayList.add(new User("小莱",10));
        arrayList.add(new User("小红", 19));
        /**
         * List——>Map
         * map<String(username)> user属性>
         */

  }
}
