import java.io.DataInputStream;
import java.io.IOException;
import java.util.*;

public class strQuestion2 {
    public static void main(String[] args) throws IOException {
        DataInputStream ds = new DataInputStream(System.in);
        System.out.println("Input  String: ");
        String str = ds.readLine();
        StringBuffer str1 = new StringBuffer(str);
        System.out.println(str1.reverse());
    }
}
