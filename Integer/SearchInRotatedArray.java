package Integer;


public class SearchInRotatedArray {


    public static int solution(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;

            } //check if low to mid is sorted
            else if (arr[low] <= arr[mid]) {
                //check if target lies between low to medium
                if (target >= arr[low] && target <= arr[mid]) {
                    high = mid - 1;

                } else {
                    low = mid + 1;
                }

            }//check if mid to high is sorted
            else if (arr[mid] <= arr[high]) {
                //check if target lies between mid to high
                if (target <= arr[mid] && target >= arr[high]) {

                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;


    }

    public static void main(String[] args) {

        System.out.println("Position is  : " + solution(new int[]{4, 5, 6, 7, 0, 1, 2}, 9));
    }

}
