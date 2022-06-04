package Integer;

public class BinarySearch {

    public static int search(int[] a, int x) {

        int l = 0;
        int r = a.length;

        while (l <= r) {

            int mid = l + (r - 1) / 2;

            if (a[mid] == x) {

                return mid;
            } else if (a[mid] < x) {

                l = mid + 1;

            } else {

                r = mid - 1;
            }

        }

        return -1;

    }

    public static void main(String[] args) {

        int result = search(new int[]{2,10,22,34,45,66}, 22);

        if(result==-1){

            System.out.println("No element found");
        }

        else{
            System.out.println("Index of element is : " + result);


        }

    }
}
