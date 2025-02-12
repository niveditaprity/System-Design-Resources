package Language.thread;

public class Thread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread Name:" + Thread.currentThread().getName());
    }
}
