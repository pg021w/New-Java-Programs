package String;

public class StringCompression {


    public static void compression1(String input) {

        String result = input.charAt(0) + "";

        for (int i = 1; i < input.length(); i++) {

            char curr = input.charAt(i);
            char prev = input.charAt(i - 1);

            if (curr != prev) {

                result += curr;
            }

        }

        System.out.println("Compression1 : " + result);

    }

    public void compression2(String input) {


    }

    public static void main(String[] args) {

        compression1("aabbccddaff");

    }
}
