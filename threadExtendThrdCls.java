class A1 extends Thread { // step 01
    A1() {
        start(); // step 02
    }

    public void run() { // step 03
        for (int i = 0; i < 10; i++) {
            System.out.println("A1's i= " + i);
        }
    }
}

public class threadExtendThrdCls {
    public static void main(String[] args) {
        new A1();
        for (int i = 0; i < 20; i++) {
            System.out.println("main's i= " + i);
        }
    }
}
