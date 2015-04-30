public class TwoThreads {
    public static class Thread1 extends Thread {

        public void run() {
            for (int a=0;a<100;a++)
            {
                System.out.println("a="+a);
            }
        }
    }
    public static class Thread2 extends Thread {

        public void run() {
            for (int b = 0; b < 100; b++) {
                System.out.println("b=" + b);
            }
        }
    }
    public static void main(String[] args) {

        new Thread1().start();
        new Thread2().start();

        System.out.println("main thread finishes");

    }

}

