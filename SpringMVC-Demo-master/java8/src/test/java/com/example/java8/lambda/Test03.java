package com.example.java8.lambda;

import com.example.java8.Service.AInterface;
import com.example.java8.Service.BInterface;
import org.junit.jupiter.api.Test;

/**
 * @author txssherry@gmail.com
 * @date 2023/1/15 0:29
 */
public class Test03 {
    /**
     * lambda表达式写法;
     () 参数列表   ->分隔符    {}方法体
     (返回什么类型的) (a,b)->{}
     */
    @Test
    public void test01(){
       //使用匿名内部类
        ((AInterface) () -> System.out.println("get")).get();

        ((AInterface) () -> System.out.println("get")).get();

        ((AInterface) ()-> System.out.println("get")).set();
    }

    @Test
    public void test02(){
        int b = new BInterface(){
            @Override
            public int get1(int a, int b) {
                return a+b;
            }
        }.get1(1,2);
        System.out.println(b);

        int b0 = ((BInterface) (a, b1) -> a + b1).get1(1,2);
        System.out.println(b0);
    }
}
