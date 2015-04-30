/**
 * Created by mopom on 4/28/15.
 */
public class HelloRunnable implements Runnable  {

    @Override
    public void run() {
        System.out.print("Hello from ");
    }

    public static void main(String[] args) {
        HelloRunnable rc = new HelloRunnable();
        Thread thread3 = new Thread(rc, "Thread 3");
        thread3.start();

        System.out.print(thread3.getName() + " ");

        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);
    }


}
