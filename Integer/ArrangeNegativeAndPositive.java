package Integer;

import java.util.Arrays;

public class ArrangeNegativeAndPositive {

    public static void arrange(int[] a) {

        int temp = 0;
        int j = 0;

        for (int i = 0; i < a.length; i++) {


            if (a[i] < 0) {

                if (i != j) {
                    System.out.println("j in : " + j);
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

                j++;
            }
        }

        System.out.println(Arrays.toString(a));

    }

    public static void main(String[] args) {

        arrange(new int[]{-1, 2, -3, 4, 5, 6, -7, 8, 9});
    }
}
