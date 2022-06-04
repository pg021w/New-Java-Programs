package Integer;

public class FibonacciWithRecursion {

    static int i = 0;
    static int j = 1;

    static int k;

    public void fibRecur(int count) {

        if (count > 0) {

            k = i + j;
            i = j;
            j = k;

            System.out.print(" " + k);


            fibRecur(count-1);

        }


    }

    public static void main(String args[]) {

        int count = 10;
        FibonacciWithRecursion fib = new FibonacciWithRecursion();
        System.out.print(i + " " +j);
        fib.fibRecur(count-2);

    }
}
