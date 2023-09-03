class sm {
    void sum(String[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += Integer.parseInt(a[i]);
        }
        System.out.println("Sum of all numbers is " + sum);
    }
}

public class sumNumbers {
    public static void main(String[] args) {
        sm ob = new sm();
        ob.sum(args);
    }

}
