package com.example.java8.lambda;

import java.util.logging.SocketHandler;

/**
 * @author txssherry@gmail.com
 * @date 2023/1/13 21:32
 */
public interface JDK8 {
    void add();

    default void getS(){
        System.out.printf("default");
    }

    static void setS(){
        System.out.printf("static");
    }
}
