package Language.thread;

public class MultiThreading extends Thread{

    @Override
    public void run() {
        System.out.println(
                "Thread " + Thread.currentThread().getId()
                        + " is running");
    }
}
