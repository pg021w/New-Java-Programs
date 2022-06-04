package String;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveAnagramString {


    public void remove(String[] arr) {

        HashSet<String> set = new HashSet<>();

        for (String word : arr) {

            String sortedWord = sort(word);

            if (!set.contains(sortedWord)) {

                set.add(word);
            }

        }

        System.out.println("Ans : " + set);

    }


    public String sort(String element) {

        char[] ch = element.toCharArray();
        Arrays.sort(ch);

        return new String(ch);

    }

    public static void main(String[] args) {

        RemoveAnagramString rem = new RemoveAnagramString();
        String[] arr = {"abc", "bca", "cab", "pqr", "prq"};
        rem.remove(arr);

    }
}
