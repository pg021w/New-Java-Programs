package Integer;

public class TwoElementsSumIsClosestToZero {

    public static void solution(int[] arr) {

        int start, end, min_start = 0, min_end = 0;
        int sum;

        int min_sum = arr[0] + arr[1];


        for (start = 0; start < arr.length - 1; start++) {

            for (end = start + 1; end < arr.length; end++) {

                sum = arr[start] + arr[end];

                if (Math.abs(min_sum) > Math.abs(sum)) {

                    min_sum = sum;
                    min_start = start;
                    min_end = end;
                }
            }
        }

        System.out.println("Values are :" + arr[min_start] + " " + arr[min_end]);


    }


    public static void main(String args[]) {
        solution(new int[]{1, 60, -10, 70, -80, 85});
    }
}
