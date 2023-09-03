import java.util.*;

public class priQueueImpl {
    public static void main(String[] args) {
        PriorityQueue que = new PriorityQueue();
        que.add("Sumit");
        que.add("Vijay");
        que.add("Jai");
        que.add("Raj");
        System.out.println(que);

        System.out.println("head: " + que.peek());
        System.out.println("Iterating elements :");
        Iterator itr = que.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("After first removal ");
        que.remove();
        System.out.println(que);

        // to remove the head element of the queue
        que.poll();
        System.out.println("After second removal :");
        System.out.println(que);
    }
}
