class Thread1 implements Runnable { // step 01
    public void run() { // step 04
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread1's i= " + i);
        }
    }
}

public class threadRunnableInterface {
    public static void main(String[] args) {
        Thread1 ob = new Thread1();
        Thread t = new Thread(ob); // step 02
        t.start(); // step 03
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread main's i=" + i);
        }
    }
}
