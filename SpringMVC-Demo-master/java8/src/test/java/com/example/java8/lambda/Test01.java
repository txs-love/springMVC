package com.example.java8.lambda;

import com.example.java8.Service.OrderService;

/**
 * @author txssherry@gmail.com
 * @date 2023/1/13 20:12
 */
class Test01 {
    public static void main(String[] args) {
        /**  1
        OrderService order = new OrderService() {
            @Override
            public void get() {
                System.out.printf("get");
            }
        };
        order.get();
        */
        //  2
        new OrderService(){
            @Override
            public void get() {
                System.out.printf("getDemo01\n");
            }
        }.get();
        System.out.println("-------------");

        //  3
        ((OrderService)()->
                System.out.println("getDemo02")).get();
    }
}