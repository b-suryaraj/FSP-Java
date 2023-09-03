import java.io.*;

import javax.print.DocFlavor.STRING;

public class throwsKeyword {
    public static void main(String[] args) throws IOException {
        DataInputStream ds = new DataInputStream(System.in);
        // BufferedReader ds = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input 3 nos: ");
        int a = Integer.parseInt(ds.readLine());
        float b = Float.parseFloat(ds.readLine());
        double c = Double.parseDouble(ds.readLine());

        System.out.println("Enter a string:");
        String ch = ds.readLine();
        System.out.println("string=" + ch);
        System.out.println("3 nos = " + a + " " + b + " " + " " + c);
    }

    /*
     * public static void main(String[] args) {
     * try {
     * DataInputStream ds = new DataInputStream(System.in);
     * // BufferedReader ds = new BufferedReader(new InputStreamReader(System.in));
     * System.out.println("Input 3 nos: ");
     * int a = Integer.parseInt(ds.readLine());
     * float b = Float.parseFloat(ds.readLine());
     * double c = Double.parseDouble(ds.readLine());
     * 
     * System.out.println("Enter a string:");
     * String ch = ds.readLine();
     * System.out.println("string=" + ch);
     * System.out.println("3 nos = " + a + " " + b + " " + " " + c);
     * } catch (IOException e) {
     * System.out.println("Exception");
     * }
     * }
     */
}
