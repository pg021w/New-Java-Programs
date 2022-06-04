package Integer;

import java.util.HashSet;

public class RemoveDuplicateFromSortedArray {

    public static void solution(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        set.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.println(set);

        System.out.print(set.size());
    }

    public static void main(String[] args) {
        solution(new int[]{0,0,1,1,1,2,2,3,3,4});
    }
}
