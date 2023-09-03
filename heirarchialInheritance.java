class A {
    int x = 20;
    int y = 30;
}

class B extends A {
    void disp() {
        System.out.println("The value of x+y is " + (x + y));
    }
}

class C extends A {
    void disp() {
        System.out.println("The value of x*y is " + (x * y));
    }
}

public class heirarchialInheritance {
    public static void main(String[] args) {
        B ob1 = new B();
        C ob2 = new C();
        ob1.disp();
        ob2.disp();
    }
}
