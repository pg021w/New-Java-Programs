package Integer;

public class TwoSum {


    public static void solution(int[] a, int target) {

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] + a[j] == target) {

                    System.out.println("[" + i + " , " + j + "]");
                }
            }
        }
    }


    public static void main(String args[]) {
        solution(new int[]{3,3}, 6);

    }
}
