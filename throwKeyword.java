class throwEg {
    void check(String s1) {
        char ch;
        ch = s1.charAt(0);
        if (ch == 'A') {
            System.out.println("valid Id");
        } else {
            try {
                throw new ArithmeticException(); // generating an exception
            } catch (ArithmeticException e) {
                System.out.println("Invalid Id");
            }
        }
    }
}

public class throwKeyword {
    public static void main(String[] args) {
        throwEg ob = new throwEg();
        ob.check("Surya");
    }
}
