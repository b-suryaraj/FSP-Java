import java.util.*;

public class lnkdHashSetImpl {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add("Viki");
        set.add("Vijay");
        set.add("Ayan");
        set.add("Viki");
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
