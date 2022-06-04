package Integer;

public class StockBuySell {

    public static int solution(int[] arr) {

        int maxProfit = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > arr[i - 1]) {

                maxProfit += arr[i] - arr[i - 1];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        System.out.println("Max Profit is  : " + solution(new int[]{100, 180, 260, 310, 40, 535, 695}));

    }
}
