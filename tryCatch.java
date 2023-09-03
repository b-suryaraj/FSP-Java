public class tryCatch {
    // public static void main(String[] args) {
    // int x = 12;
    // int y = 2; // The result is 6.
    // // int y = 0; //java.lang.ArithmeticException: / by zero

    // try {
    // int z = x / y;
    // System.out.println("The result is " + z);
    // } catch (Exception e) { // There are almost 400 Exceptionclasses under
    // Exception parentclass therefore we
    // // just write Exception
    // System.out.println(e);
    // }
    // }

    public static void main(String[] args) {
        int x = 12;
        // int y = 2; // The result is 6.
        int y = 0; // Division by zero results infinity

        try {
            int z = x / y;
            System.out.println("The result is " + z);
        } catch (ArithmeticException e) { // There are almost 400 Exceptionclasses under Exception parentclass therefore
                                          // we just write Exception
            System.out.println("Division by zero results infinity");
        }
    }
}
