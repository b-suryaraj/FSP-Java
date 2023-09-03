public class stringEquals {
    public static void main(String[] args) {
        String str1 = new String("This is really not immutable!!");
        String str2 = new String("This is really not immutable!!");
        System.out.println(str1.equals(str2));
    }
}
