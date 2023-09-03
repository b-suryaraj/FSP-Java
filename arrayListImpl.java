import java.util.*;

public class arrayListImpl {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        System.out.println("Initial size of a1: " + a1.size());
        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");
        a1.add(5);
        a1.add("Ayan");
        a1.add(20.25);
        a1.add(1, "A2"); // Adding elements in middle (A2 added at 1 index)
        // display size of a1 after additions
        System.out.println("Size of a1 after additons : " + a1.size());
        // display arraylist
        System.out.println("Contents of a1 :" + a1);
        // Remove elements from ArrayList
        a1.remove("F");
        a1.remove(2); // removing using index
        // display size of a1 after removing
        System.out.println("Size of a1 after deletions: " + a1.size());
        System.out.println("Contents of a1: " + a1);

        // Traversing list through Iterator
        Iterator itr = a1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Traversing list through Iterator but converting to string
        String s;
        Iterator itr2 = a1.iterator();
        while (itr2.hasNext()) {
            s = itr2.next().toString();
            System.out.println(s);
        }

        // Traversing list using for but converting to string
        String s2;
        for (int i = 0; i < a1.size(); i++) {
            s2 = a1.get(i).toString();
            System.out.println(s2);
        }

    }
}
