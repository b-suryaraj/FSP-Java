class Thread1 implements Runnable {
    Thread1() {
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread1's i= " + i);
        }
    }
}

public class constThreadRunnableInter {
    public static void main(String[] args) {
        new Thread1();
        for (int i = 0; i < 20; i++) {
            System.out.println("Thread main's i= " + i);
        }
    }
}
