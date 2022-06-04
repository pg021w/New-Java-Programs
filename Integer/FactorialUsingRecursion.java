package Integer;

public class FactorialUsingRecursion {

    public int factorial(int num) {


        if (num <= 1) {
            return 1;
        } else {

            return num * factorial(num - 1);

        }

    }

    public static void main(String args[]) {
        FactorialUsingRecursion facto = new FactorialUsingRecursion();

        System.out.println(facto.factorial(4));

    }
}
