package String;

import java.util.ArrayList;
import java.util.Collections;

public class ReverserStringsAndWords {


    public static void reverse(String input) {

        String[] arr = input.split(" ");

        System.out.println("String:  " + input);

        String rev = "";

        for (int i = arr.length - 1; i >= 0; i--) {

            char[] revArr = arr[i].toCharArray();


            for (int j = revArr.length - 1; j >= 0; j--) {


                rev = rev + revArr[j];


            }

            rev = rev + " ";


        }


        System.out.println("Reverse String: " + rev);


    }

    public static void main(String args[]) {

        reverse("My name is ankita");
    }

    public static class TestClass {

        public static void add() {

            String s = "geeks quiz practice code";

            String word = "";

            ArrayList<String> list = new ArrayList<>();

            for (int i = 0; i < s.length(); i++) {


                word += s.charAt(i);


                if (s.charAt(i) == ' ') {
                    list.add(word);
                    word = "";
                }


            }
            list.add(word);

            Collections.reverse(list);



            System.out.println("List : " + list);


        }


        public static void main(String args[]) {

            add();

        }


    }
}
