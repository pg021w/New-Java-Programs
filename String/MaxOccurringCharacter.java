package String;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurringCharacter {


    public static void maxCharacter(String input) {

        char[] arr = input.replaceAll("\\s+", "").toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        for (char a : arr) {

            if (map.containsKey(a)) {

                map.put(a, map.get(a) + 1);
            } else {

                map.put(a, 1);
            }

        }

        int maxValue = 0;
        char maxKey = 0;

        StringBuilder allCharacters = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {


            if (entry.getValue() > maxValue) {

                maxValue = entry.getValue();
                maxKey = entry.getKey();

            }

            if (entry.getValue() == 1) {
                allCharacters.append(entry.getKey());
            } else {
                allCharacters.append(entry.getKey()).append(entry.getValue());
            }


        }

        System.out.println("All : " + allCharacters);

        System.out.println("Character : " + maxKey + " Value " + maxValue);


    }

    public static void main(String args[]) {

        maxCharacter("aasavvvvvqql");

    }


}
