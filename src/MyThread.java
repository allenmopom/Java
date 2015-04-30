/**
 * Created by mopom on 4/25/15.
 */
public class MyThread extends Thread {

    public void run(){
        System.out.print("MyThread running");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

    }

}
