package threads;

public class EvenOddPrinter {

    public static class EvenThread extends Thread {
        @Override
        public void run() {
            for (int i = 2; i <= 60; i += 2) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }

    public static class OddThread extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 60; i += 2) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}

