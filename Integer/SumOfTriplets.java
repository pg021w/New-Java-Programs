package Integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfTriplets {

    public static void sum(int[] arr, int sum) {


        for (int i = 0; i < arr.length - 2; i++) {

            for (int j = i + 1; j < arr.length - 1; j++) {

                for (int k = j + 1; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == sum) {

                        System.out.println("Numbers : " + arr[i] + "," + arr[j] + "," + arr[k]);
                    }


                }

            }


        }

    }

    public static void triplet(int[] arr, int sum) {
        List<List<Integer>> mainList = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            int l = i + 1;
            int r = arr.length - 1;
            int x = arr[i];

            while (l < r) {

                if (x + arr[l] + arr[r] == sum) {
                    List<Integer> subList = new ArrayList<>();

                    subList.add(x);
                    subList.add(arr[l]);
                    subList.add(arr[r]);
                    mainList.add(new ArrayList<>(subList));
                    l++;
                    r--;


                } else if (arr[i] + arr[l] + arr[r] < sum) {
                    l++;
                } else {
                    r--;
                }


            }

        }
    }

    public static void solution2(int[] arr, int sum) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            int l = i + 1;
            int r = arr.length - 1;
            int x = arr[i];

            while (l < r) {

                if (x + arr[l] + arr[r] == sum) {

                    System.out.println(x + ", " + arr[l] + ", " + arr[r]);

                    l++;
                    r--;


                } else if (x + arr[l] + arr[r] < sum) {
                    l++;
                } else {
                    r--;
                }


            }


        }


    }

    public static void main(String args[]) {

        int[] arr = {1, 0, -1, 0, -2, 2};
        //sum(arr, 3);


    }


}
