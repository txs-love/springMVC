package com.example.java8.Service;

/**
 * @author txssherry@gmail.com
 * @date 2023/1/15 0:08
 */
@FunctionalInterface     //函数接口
public interface MyFunctionalInterface {
    void get();
    default void DefaultAdd(){
        System.out.println("我是默认方法");
    }

    /**
     * object父类的方法在函数接口当中重写;
     * @return
     */
    String toString();
}
