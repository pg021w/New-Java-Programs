package Integer;


public class FindLeaders {

    public static void leaders(int[] arr) {


        int max = arr[arr.length - 1];
        System.out.print(max + " ");

        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] > max) {
                max = arr[i];
                System.out.print(max + " ");

            }

        }



    }

    public static void main(String[] args) {
        leaders(new int[]{16, 17, 21, 4, 5, 2});

    }
}
