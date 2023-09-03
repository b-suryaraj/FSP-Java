//RUNTIME POLYMORPHISM

class Parent {
    void disp() {
        System.out.println("This is a parent class");
    }
}

class Child1 extends Parent {
    void disp() {
        System.out.println("This is a Child1 class method");
    }
}

class Child2 extends Parent {
    void disp() {
        System.out.println("This is a Child2 class method");
    }
}

public class dynamicMethodDispatch {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.disp();
        Child1 ob1 = new Child1();
        Child2 ob2 = new Child2();
        ob1.disp();
        ob2.disp();
        p = ob1; // the object Child1 is referred by Parents reference variable p
        p.disp();
        p = ob2; // the object Child2 is referred by Parents reference variable p
        p.disp();
    }
}