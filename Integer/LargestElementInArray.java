package Integer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestElementInArray {


    public static Integer largestElement(Integer[] arr, int k) {


        // arr = new Integer[]{1, 5, 8, 3, 4, 9};

        List<Integer> list = Arrays.asList(arr);

        Collections.sort(list, Collections.reverseOrder());

        System.out.println("Sorted List " + list);
        System.out.print(k + "th largest: " + list.get(k - 1));

        return list.get(k - 1);


    }


    public static void main(String args[]) {

        Integer[] arr = new Integer[]{1, 5, 8, 3, 4, 9};
        largestElement(arr, 4);

    }
}
