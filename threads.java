public class threads {
    public static void main(String[] args) {
        Thread ob = new Thread();
        ob.currentThread();
        System.out.println(ob);
        // ob.setName("Ayan");
        // ob.setPriority(10);
    }
}

// output : Thread[Thread-0,5,main]
// -> thread 0 is technically the name of the main thread.
// -> 5 denotes the default priority of the main thread.
// -> the main() denotes from whch methods the main thread is called
// -> The thread class contains a method called setName() using which we can
// change the name of a thread.
// -> The thread class contains a method called setPriority() using which we can
// change the prioriy levelof thread.
