public class Main {
    public static void main(String[] args) {
        KronometreThread kronometreThread = new KronometreThread("thread1");
        KronometreThread kronometreThread1 = new KronometreThread("thread2");
        KronometreThread kronometreThread2 = new KronometreThread("thread3");


        kronometreThread.start();
        kronometreThread1.start();
        kronometreThread2.start();
    }
}