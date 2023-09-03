package p2;

import p1.Abc;

public class Xyz {
    public void display() {
        Abc ob = new Abc();
        // System.out.println(ob.a); // default cannot access different packages (ie p1
        // and
        // p2)
        System.out.println(ob.b);
        // System.out.println(ob.c); // private member cannot be inherited to another
        // class\\this will give error
        // System.out.println(ob.d); //protected can not be accessed if both class are
        // in different packages and one class in not child class of another class
    }
}
