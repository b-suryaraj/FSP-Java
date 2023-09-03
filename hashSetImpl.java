import java.util.*;

public class hashSetImpl {
    public static void main(String[] args) {
        // Creating HashSet and adding elements
        HashSet set = new HashSet();
        set.add("Raj");
        set.add("Vijay");
        set.add("Raj");
        set.add("Ayan");
        System.out.println(set);
        set.remove("Raj");

        // Traversing elements
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
