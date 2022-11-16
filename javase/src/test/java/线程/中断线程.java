package 线程;

public class 中断线程 {

    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread();
        t.start();
        t.join(); // 等待t线程结束
        t.interrupt(); // 中断t线程
        System.out.println("end");
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            int n = 0;
            while (! isInterrupted()) {
                n ++;
                System.out.println(n + " hello!");
            }
        }
    }
}
