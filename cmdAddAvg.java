class op {
    void add(int a, int b) {
        System.out.println("Sum is " + (a + b));
    }

    void avg(int a, int b) {
        System.out.println("Avg is " + ((a + b) / 2));
    }
}

class cmdAddAvg {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Sum is " + (a + b));
        System.out.println("Average is " + ((a + b) / 2));
        op ob = new op();
        ob.add(a, b);
        ob.avg(a, b);

    }
}