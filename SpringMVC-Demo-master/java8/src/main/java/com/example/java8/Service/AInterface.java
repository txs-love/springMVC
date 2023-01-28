package com.example.java8.Service;

/**
 * @author txssherry@gmail.com
 * @date 2023/1/15 0:34
 */
@FunctionalInterface
public interface AInterface {
    void get();
    default void set(){
        System.out.println("set");
    }
}
