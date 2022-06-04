package Integer;

import java.util.Arrays;

public class MinSwaps {

    public int solution(int[] a) {


        int ans = 0;
        int[] temp = Arrays.copyOfRange(a, 0, a.length);
        Arrays.sort(temp);
        for (int i = 0; i < a.length; i++) {

            if (a[i] != temp[i]) {

                ans++;

                swap(a, i, indexOf(a, temp[i]));

            }
        }

        return ans;

    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int indexOf(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String args[]) {

        MinSwaps swap = new MinSwaps();
        System.out.println(swap.solution(new int[]{101, 758, 315, 730, 472, 619, 460, 479}));
    }
}
