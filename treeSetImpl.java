import java.util.*;

public class treeSetImpl {
    public static void main(String[] args) {
        // Creating and adding elements
        TreeSet set = new TreeSet<>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");

        // Traversing elements
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
