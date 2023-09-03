class A {
    int a = 10;
}

class B extends A {
    int a = 20;

    void disp() {
        System.out.println(a); // displays overidden variable value i.e 20
        // super() keyword use
        System.out.println(super.a); // displays the same variable value in parent class i.e 10
    }
}

public class varOverriding {
    public static void main(String[] args) {
        B ob = new B();
        ob.disp();
    }
}
