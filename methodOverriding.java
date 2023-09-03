class Parent {
    int a = 10, b = 30;

    void display() {
        int c = a + b;
        System.out.println("The sum is " + c);
    }
}

class child extends Parent {
    void display() {
        super.display(); // callig the display of parent which is already overriden
        int d = a * b;
        System.out.println("The product is " + d);
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        child ob = new child();
        ob.display();
    }
}
