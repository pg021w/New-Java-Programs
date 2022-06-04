package Integer;

import java.util.Arrays;

public class ReplaceWithLargerNumber {


    public static void replaceWithLargerNumber() {

        int[] arr = {16, 17, 4, 3, 5, 2};

        int size = arr.length;

        int max_from_right = arr[size - 1];


        arr[size - 1] = -1;

        for (int i = size - 2; i >= 0; i--) {

            int temp = arr[i];

            System.out.println("temp: " + temp);


            arr[i] = max_from_right;

            System.out.println("max: " + max_from_right);


            if (max_from_right < temp) {

                max_from_right = temp;
                System.out.println("in if max: " + max_from_right);

            }


        }

        System.out.println("Array: " + Arrays.toString(arr));
    }




    public static void main(String args[]) {


        replaceWithLargerNumber();


    }
}
