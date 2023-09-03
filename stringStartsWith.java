public class stringStartsWith {
    public static void main(String[] args) {
        String str = new String("This is really not immutable!!");
        boolean retVal;
        retVal = str.startsWith("This is");
        System.out.println("Returned value = " + retVal);
    }
}
