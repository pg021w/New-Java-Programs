package String;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateWord {

    public static void removeDuplicate(String input) {

        String[] strgArray = input.split("\\s+");

        Set<String> set = new LinkedHashSet<>();

        for (String s : strgArray) {
            System.out.println("in for");

            if ((!set.contains(s.toLowerCase()))) {

                System.out.println("in if");


                set.add(s);
            }
        }

        System.out.println("Final String : " + set.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));

    }

    public static void removeDuplicate1(String input) {

        String[] strgArray = input.split("\\s+");

        StringBuilder builder = new StringBuilder();

        for(String s : strgArray){

            if(builder.indexOf(s.toLowerCase())==-1){
                builder.append(s).append(" ");
            }
        }

        System.out.println("String : " + builder);
    }



    public static void main(String[] args) {

        removeDuplicate1("in inthe");

    }
}
