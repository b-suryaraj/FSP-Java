import java.util.*;

public class arrDequeImpl {
    public static void main(String[] args) {
        // Creating Deque and adding elements
        Deque deque = new ArrayDeque();
        deque.add("Sourav");
        deque.add("Amit");
        deque.add("Ajay");
        deque.add("Ashish");

        System.out.println(deque);
        deque.offerFirst("Raj"); // add at first
        deque.offerLast("Ayan"); // add at last

        System.out.println(deque);
        deque.pollFirst(); // remove from first
        deque.pollFirst(); // remove
        System.out.println(deque);

    }
}
