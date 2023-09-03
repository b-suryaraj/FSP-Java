import java.util.*;

public class linkedListImpl {
    public static void main(String[] args) {
        LinkedList a1 = new LinkedList();
        a1.add("Ayan");
        a1.add("Roy");
        a1.add("S");
        a1.add(25);

        // display size of a1 after additions
        System.out.println("Size of a1 after additons : " + a1.size());

        Iterator itr = a1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        a1.remove("Roy");
        a1.remove(2); // removing using index

        Iterator itr2 = a1.iterator();
        while (itr2.hasNext()) {

            System.out.println(itr2.next());
        }

        // Traversing list using for but converting to string
        String s2;
        for (int i = 0; i < a1.size(); i++) {
            s2 = a1.get(i).toString();
            System.out.println(s2);
        }

    }
}
