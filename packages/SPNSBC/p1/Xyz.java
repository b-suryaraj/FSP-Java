package p1;

public class Xyz {
    public void display() {
        Abc ob = new Abc();
        System.out.println(ob.a);
        System.out.println(ob.b);
        //System.out.println(ob.c); // private member cannot be inherited to another
        // class\\this will give error
        System.out.println(ob.d);
    }
}
