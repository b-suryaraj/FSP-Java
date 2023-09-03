class co {
    int a, b;

    co() {
        a = 20;
        b = 40;
    }

    co(int x, int y) {
        a = x;
        b = y;
    }

    co(int x) {
        a = x;
        b = 180;
    }

    void display() {
        System.out.println("The values of a and b are  " + a + " " + b);
    }
}

public class constOverload {
    public static void main(String[] args) {
        co ob1 = new co(50);
        co ob2 = new co();
        co ob3 = new co(50, 80);
        ob1.display();
        ob2.display();
        ob3.display();
    }

}
