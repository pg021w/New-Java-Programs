package Integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    List<Integer> tripletList;
    List<List<Integer>> mainList = new ArrayList<>();


    public void solution(int[] arr, int sum) {
        Arrays.sort(arr);
        System.out.println("Arrays : " + Arrays.toString(arr));

        int n = arr.length;

        for (int i = 0; i <= n-4; i++) {
            int val;

            val = arr[i];
            System.out.println("val : " + val);


            if (triplet(arr, sum - val, i + 1)) {
                tripletList.add(val);
                mainList.add(new ArrayList<>(tripletList));
                tripletList.clear();
            }


        }

        System.out.println("Elements : " + mainList);


    }

    public boolean triplet(int[] arr, int sum, int si) {

        int l, r;
        tripletList = new ArrayList<>();
        for (int i = si; i <= arr.length-1; i++) {
            l = si + 1;
            r = arr.length - 1;
            while (l < r) {
                if (arr[i] + arr[l] + arr[r] == sum) {
                    tripletList.add(arr[i]);
                    tripletList.add(arr[l]);
                    tripletList.add(arr[r]);

                    return true;

                } else if (arr[i] + arr[l] + arr[r] < sum) {
                    l++;
                } else {
                    r--;
                }

            }

        }

        return false;
    }

    public static void main(String[] args) {

        FourSum four = new FourSum();
        four.solution(new int[]{1, 0, -1, 0, -2, 2}, 0);
    }
}
