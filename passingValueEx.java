class pv1 {
    int a, b;

    void input(int x, int y) {
        a = x;
        b = y;
    }

    void display() {
        System.out.println("The values are " + a + " & " + b);
    }
}

public class passingValueEx {
    public static void main(String args[]) {
        pv1 ob = new pv1();
        pv1 ob2 = new pv1();
        ob.input(20, 40);
        ob2.input(120, 400);
        ob.display();
        ob2.display();
    }
}
