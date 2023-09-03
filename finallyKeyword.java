public class finallyKeyword {
    public static void main(String[] args) {
        int x = 12;
        int y = 2; // The result is 6.
        // int y = 0; // Division by zero results infinity

        try {
            int z = x / y;
            System.out.println("The result is " + z);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero results infinity");
        } finally {
            System.out.println("Finally Statement"); // whether there's an exception or not this will execute
        }
    }

}
