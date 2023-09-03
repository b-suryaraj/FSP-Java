package p1;

public class Abc {
    int a = 10;
    public int b = 20;
    private int c = 30;
    protected int d = 40;

    public void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c); // private member cannot be inherited to another
        // class\\this will give error
        System.out.println(d);
    }
}
