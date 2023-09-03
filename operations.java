//q) Take input of two variables perform addition , and product and display the results

import java.util.*;

class methods {
    int a, b, s, product;

    void input() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

    }

    void cal() {
        s = a + b;
        product = a * b;
    }

    void res() {
        System.out.println("Sum of " + a + "&" + b + " = " + s);
        System.out.println("Product of " + a + "&" + b + " = " + product);

    }
}

public class operations {
    static public void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        methods ob = new methods();
        ob.input();
        ob.cal();
        ob.res();

    }
}
