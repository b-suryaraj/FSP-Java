package p2;

import p1.Abc;

public class Xyz extends Abc {
    public void display() {
        // System.out.println(a); //default cannot access different packages (ie p1 and
        // p2)
        System.out.println(b);
        // System.out.println(c); // private member cannot be inherited to another
        // class\\this will give error
        System.out.println(d);
    }
}
