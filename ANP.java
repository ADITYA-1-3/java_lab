package PRACTICE;

class NumPrinter extends Thread {
    private final int start;
    private final int end;

    public NumPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class ANP{
    public static void main(String[] args) {
        Thread t1 = new NumPrinter(1, 10);
        Thread t2 = new NumPrinter(90, 100);

        t1.start();
        t2.start();
    }
}
     