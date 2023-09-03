import java.util.*;
import java.util.Stack;

public class stackImpl {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        stack1.push("Ayan");
        stack1.push("Sourav");
        stack1.push("Amit");
        stack1.push("Ashish");
        stack1.push("Manoj");
        System.out.println("Before poping any values: ");
        Iterator itr = stack1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        stack1.pop();
        System.out.println("After poping : ");
        Iterator itr2 = stack1.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        // removing elements from stack
        stack1.remove(2);
        System.out.println("After removing");
        Iterator itr3 = stack1.iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }

        // to display top element of the stack
        String s1 = stack1.peek().toString();
        System.out.println("Top element is: ");
        System.out.println(s1);

        // to check whether a stack is empty or not
        boolean b = stack1.empty();
        System.out.println(b);

        // to search element in stack
        int pos = stack1.search("Ashish");
        System.out.println("The element is present in " + pos + " position");

        int pos1 = stack1.search("Akanshu");
        System.out.println("The element is present in " + pos1 + " position");

        // to remove all elements from stack
        stack1.removeAllElements();
        System.out.println(stack1);
    }
}
