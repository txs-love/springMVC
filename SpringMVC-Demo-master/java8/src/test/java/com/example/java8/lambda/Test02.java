package com.example.java8.lambda;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


/**
 * @author txssherry@gmail.com
 * @date 2023/1/13 22:36
 */
public class Test02 extends Thread implements Runnable{
    private static Runnable Thread1;

    public static void main(String[] args) {
        /**
         * 继承 Thread 线程类
         * 实现 Runnable 接口
         * 创建 Callable 接口的实现类
                   可以获得任务执行返回值；
                   通过与 Future 的结合，可以实现利用 Future 来跟踪异步计算的结果
         * 使用拉姆达表达式创建(1.8)
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" run3  ");
            }
        }).start();

        new Thread(() -> System.out.println(Thread.currentThread().getName()+" run1")).start();

        new Thread(() -> System.out.println(Thread.currentThread().getName()+" run2")).start();

        new ForkJoinPool().submit(new Thread1());

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 2, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));
        threadPoolExecutor.execute(Thread1);




    }

}
