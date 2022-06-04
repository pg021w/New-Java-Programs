package Integer;

public class PalindromeOfNumber {

    public boolean isPalindrome(int x) {

        String s = String.valueOf(x);

        String newS = "";

        for (int i = s.length() - 1; i >= 0; i--) {

            newS = newS + s.charAt(i);
        }

        int revInt = Integer.parseInt(newS);


        if (x == revInt) {

            return true;
        } else {

            return false;
        }

    }

    public static void main(String args[]) {

        PalindromeOfNumber pal = new PalindromeOfNumber();

        System.out.println("Output: " + pal.isPalindrome(111));

    }
}
