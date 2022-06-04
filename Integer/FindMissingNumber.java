package Integer;

public class FindMissingNumber {

    public static void missingNumber(int[] a) {

        int n = a.length;
        int sum = (n + 1) * (n + 2) / 2;

        for (int i = 0; i < a.length; i++) {

            sum -= a[i];
        }

        System.out.println("Missing number : " + sum);

    }


    public static void main(String args[]) {

        missingNumber(new int[]{1, 2, 4, 5});
    }
}
