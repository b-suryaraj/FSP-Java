class A { // Parent Class
    int a = 50;
}

class B extends A { // B is child of A
    int b = a * a;
}

class C extends B { // C is child of B and Grandchild of A
    void disp() {
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);
    }
}

public class multiLevelInheritance {
    public static void main(String[] args) {
        C ob = new C();
        ob.disp();
    }
}
