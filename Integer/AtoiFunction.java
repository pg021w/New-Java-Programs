package Integer;

public class AtoiFunction {


    public static void solution(String str) {

        int result = 0;
        int sign = 1;


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (ch == '-') {

                sign = -1;
            }
            if (ch - '0' >= 0 && ch - '0' <= 9) {
                result = result * 10 + ch - '0';
            } else {
                System.out.println("false");
            }

        }

        System.out.println("Result : " + result * sign);

    }

    public static void main(String[] args) {

        solution("-987");

    }
}
