interface i1 {
    void display1();
}

interface i2 {
    void display2();
}

class Inter implements i1, i2 {
    public void display1() {
        System.out.println("Display for interface 1");
    }

    public void display2() {
        System.out.println("Display for Interface 2");
    }
}

public class interfaceImplement {
    public static void main(String[] args) {
        i1 ob1 = new Inter(); // creating obj for class Inter & Assigning it to interface i1
        ob1.display1();
        i2 ob2 = new Inter();
        ob2.display2();
    }
}