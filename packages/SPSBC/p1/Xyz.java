package p1;

public class Xyz extends Abc {
    public void display() {
        System.out.println(a);
        System.out.println(b);
        // System.out.println(c); // private member cannot be inherited to another
        // class\\this will give error
        System.out.println(d);
    }
}
