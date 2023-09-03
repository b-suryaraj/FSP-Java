class A { // Parent Class
    int i = 10;
}

class B extends A { // Inheriting parent class
    void disp() {
        System.out.println(i);
    }
}

public class singleLevelInheritance {
    public static void main(String[] args) {
        B ob = new B();
        ob.disp();
    }
}
