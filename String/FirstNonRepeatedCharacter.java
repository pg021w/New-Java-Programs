package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {


    public static char nonRepeatedChar(String input) {

        char[] arr = input.toCharArray();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        for (char c : arr) {

            if (map.containsKey(c)) {

                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {

                return entry.getKey();

            }
        }

        throw new RuntimeException("didn't find any non repeated Character");

    }

    public static void main(String[] args) {

        System.out.println(nonRepeatedChar("acbabd"));

    }
}
