package com.qihang;

/**
 * @Author: QiHangZhang
 * @Date: 2020/10/9 15:36
 * @Description:
 */
public class Thread_Join_Test {

    /**
     * main====>0
     * main====>1
     * main====>2
     * main====>3
     * main====>4
     * main====>5
     * main====>6
     * 线程1====>0
     * main====>7   //只要i==8强制启动的线程直接执行完毕，期间其他线程无法启动
     * 线程1====>1
     * 线程1====>2
     * 线程1====>3
     * 线程1====>4
     * 线程1====>5
     * 线程1====>6
     * 线程1====>7
     * 线程1====>8
     * 线程1====>9
     * main====>8
     * main====>9
     * @param args
     */
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t = new Thread(mt, "线程1");
        t.start();

        for (int i = 0; i < 10; i++) {
            if(i==8){
                try {
                    //强制运行一个线程，线程强制运行期间，其他线程无法运行，必须等待此线程完成之后才可以继续执行。
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"====>"+i);
        }
    }
}

class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"====>"+i);
        }
    }
}
