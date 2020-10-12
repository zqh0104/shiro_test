package com.qihang;

/**
 * @Author: QiHangZhang
 * @Date: 2020/10/12 11:29
 * @Description:
 */
public class Thread_Yield_Test {
    public static void main(String[] args) {
        MyThread1 mt = new MyThread1();
        Thread t1 = new Thread(mt, "线程A");
        Thread t2 = new Thread(mt, "线程B");
        t1.start();
        t2.start();
    }
}

class MyThread1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            /*try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            System.out.println(Thread.currentThread().getName()+"====>"+i);
            if(i==2){
                System.out.print("线程礼让：");
                Thread.currentThread().yield();
            }
        }
    }
}
