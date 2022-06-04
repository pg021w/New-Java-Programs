package Integer;

import java.util.Arrays;

public class SortArrayInLargestSmallestOrder {

    public static void sortArray(int[] a) {

        int n = a.length;
        Arrays.sort(a);

        int[] b = new int[n];

        int count = 0;

        for (int i = 0, j = n - 1; i <= n / 2 || j > n / 2; i++, j--) {


            if (count < n) {

                b[count] = a[j];
                count++;
                b[count] = a[i];
                count++;
            }

        }

        System.out.println("Array : " + Arrays.toString(b));


    }

    public static void main(String[] args) {

        sortArray(new int[]{2, 4, 3, 5, 1, 2, 4, 3, 5, 1});

    }
}
