import java.io.*;

public class strQuestion1 {
    public static void main(String[] args) throws IOException {
        DataInputStream ds = new DataInputStream(System.in);
        System.out.println("Input  String: ");
        String str = ds.readLine();
        StringBuffer str1 = new StringBuffer(str);
        System.out.println("Enter starting position and ending position:");
        int b = Integer.parseInt(ds.readLine());
        int c = Integer.parseInt(ds.readLine());
        str1.delete(b - 1, c);
        System.out.println(str1);

    }
}
