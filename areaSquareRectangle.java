class Arr {
    void area(int a) {
        System.out.println("Area of Square is " + a * a);
    }

    void area(int a, int b) {
        System.out.println("Area of Rectangle is " + a * b);
    }
}

public class areaSquareRectangle {
    public static void main(String args[]) {
        Arr ob = new Arr();
        ob.area(3);
        ob.area(4, 5);

    }

}
