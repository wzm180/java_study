package thread;

import org.junit.jupiter.api.Test;

public class 创建线程 {

    @Test
    /**
     * 创建自定义线程类，继承Thread类，重写run方法
     */
    public void test1(){

        class MyThread extends Thread{
            @Override
            public void run() {
                System.out.println("t1 run");
            }
        }
        MyThread t1 = new MyThread();
        t1.start();
    }

    @Test
    /**
     * 创建自定义Runable类，实现Runable接口，重写run方法
     * new Thread中传入自定义Runable对象
     */
    public void test2(){
        class MyRunable implements Runnable{
            @Override
            public void run() {
                System.out.println("t2 run");
            }
        }
        MyRunable myRunable = new MyRunable();
        Thread t2 = new Thread(myRunable);
        t2.start();
    }

    @Test
    /**
     * new Thread中采用匿名内部类构建自定义Runable对象
     */
    public void test3(){
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t3 run");
            }
        });
        t3.start();
    }

    @Test
    /**
     * new Thread中采用匿名内部类构建自定义Runable对象
     * 采用lambda表达式进一步改进
     */
    public void test4(){
        Thread t4 = new Thread(() -> System.out.println("t4 run"));
        t4.start();
    }
}
