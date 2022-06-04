package Integer;

public class ContainerWithMostWater {

    public static void solution(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int water = 0;

        while (i < j) {
            int width = j - i;
            int height = Math.min(heights[i], heights[j]);
            water = Math.max(water, width * height);

            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }

        System.out.println("Max water : " + water);

    }

    public static void main(String[] args) {
        solution(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
    }
}
