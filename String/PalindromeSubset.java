package String;

import java.util.HashMap;
import java.util.Map;

public class PalindromeSubset {


    public void fetchPalindromeSubstring(String input) {

        Map<String, Integer> setOfPalindrome = new HashMap<>();
        String ss = "";
        for (int i = 0; i < input.length(); i++) {

            for (int j = i + 1; j <= input.length(); j++) {

                ss = input.substring(i, j);

                if (isPalindrome(ss)) {

                    System.out.println("Palindrome Substring : " + ss);
                    setOfPalindrome.put(ss, ss.length());
                }

            }


        }

        int max = 0;
        String maxKey = null;
        for (Map.Entry<String, Integer> entry : setOfPalindrome.entrySet()) {


            if (entry.getValue() > max) {
                max = entry.getValue();
                maxKey = entry.getKey();
            }

        }

        System.out.println("Longest Palindrome : " + maxKey);


    }


    public boolean isPalindrome(String subString) {


        String pali = "";
        for (int i = subString.length() - 1; i >= 0; i--) {

            pali += subString.charAt(i);


        }

        return pali.length() > 1 && pali.equals(subString);
    }

    public static void main(String[] args) {

        PalindromeSubset palindromeSubset = new PalindromeSubset();
        palindromeSubset.fetchPalindromeSubstring("abccba");

    }
}
