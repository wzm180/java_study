package thread;

public class 线程join方法 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start");
        Thread t = new Thread(() -> {
            System.out.println("t start");
            System.out.println("t end");
        });
        t.start();
        t.join();   //main线程等t线程结束之后再执行
        System.out.println("main end");
    }
}
