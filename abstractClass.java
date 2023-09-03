abstract class Parent {
    abstract void display();

    void display2() {
        System.out.println("Testing for abstract class");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("This body is provided by child class");
    }

    void display3() {
        System.out.println("Child");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        Child t = new Child();
        t.display();
        t.display2();
        t.display3();
    }
}
