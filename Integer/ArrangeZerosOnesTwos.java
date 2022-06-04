package Integer;

import java.util.Arrays;

public class ArrangeZerosOnesTwos {

    public static void arrangeElements() {


        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        int l = 0;
        int m = 0;
        int temp;
        int h = arr.length - 1;

        while (m <= h) {

            if (arr[m] == 0) {

                temp = arr[l];
                arr[l] = arr[m];
                arr[m] = temp;

                l++;
                m++;
            } else if (arr[m] == 2) {
                temp = arr[m];
                arr[m] = arr[h];
                arr[h] = temp;
                h--;
            } else {

                m++;

            }


        }

        System.out.println("Sorted array : " + Arrays.toString(arr));

    }


    public static void main(String args[]) {

        arrangeElements();
    }

}
