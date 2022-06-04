package Integer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RomanToInteger {

    public int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();

        int sum = 0;

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        for (int i = 0; i < s.length(); i++) {

            System.out.println("i here1 " + i);


            if (i != s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {

                sum += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                i++;

                System.out.println("i here2 " + i);

            } else {

                sum += map.get(s.charAt(i));


            }

        }

        return sum;

    }

    public static void main(String args[]) {
        RomanToInteger rom = new RomanToInteger();

        System.out.println("Output : " + rom.romanToInt("IVX"));


    }
}
