package Language.thread;

public class Main {
    public static void main(String[] args) {

        for(int i = 0; i<8; i++) {
            Thread1 thread1 = new Thread1();
            Thread thread = new Thread(thread1);
            thread.start();
        }


        for(int i = 0; i<8; i++) {
            MultiThreading multiThreading = new MultiThreading();
            multiThreading.start();
        }


    }
}
