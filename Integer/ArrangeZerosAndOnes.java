package Integer;

import java.util.Arrays;

public class ArrangeZerosAndOnes {


    public static void separateNumbers(int[] arr) {

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {

            System.out.println("Value of i  : " + i);
            System.out.println("Value of counter  : " + counter);

            if (arr[i] != 1) {

                arr[counter] = arr[i];

                counter++;
            }
        }

        System.out.println("Counter : " + counter);
        while (counter < arr.length) {
            arr[counter] = 1;
            counter++;
        }

        System.out.print("Array : " + Arrays.toString(arr));
    }


    public static void main(String args[]) {

        int[] arr = new int[]{1, 0, 1, 1, 0, 1, 0};
        separateNumbers(arr);

    }
}
