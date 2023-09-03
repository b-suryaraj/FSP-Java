class nomatch extends Exception {
}

class throwEg {
    void check(String s1) throws nomatch {
        char ch;
        ch = s1.charAt(0);
        if (ch == 'A') {
            System.out.println("valid ID");
        } else {
            throw new nomatch();
        }
    }
}

public class userDefineException {
    public static void main(String[] args) {
        throwEg ob = new throwEg();
        try {
            ob.check("Ayan");
        } catch (nomatch e) {
            System.out.println("Invalid Id");
        } finally {
            System.out.println("Thanks");
        }
    }
}
