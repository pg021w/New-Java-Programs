package String;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class VowelsAndConsonants {

    public static void countVowelsAndConsonants(String input) {


        int vowels = 0;
        int consonants = 0;

        String ref = "aeiouAEIOU";


        for (int i = 0; i< input.length(); i++) {

            if ((input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') || (input.charAt(i) >= 'a' && input.charAt(i) <= 'z')) {

                if (ref.indexOf(input.charAt(i)) != -1) {

                    vowels++;
                } else {
                    consonants++;
                }

            }


        }
        System.out.println("Vowels : " + vowels + " , " + "Consonants : " + consonants);


    }

    public static void removeDuplicates(String input) {

      /*  String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (!result.contains(String.valueOf(input.charAt(i)))) {
                result += String.valueOf(input.charAt(i));
            }
        }
        System.out.println("Results: " + result);*/

        SimpleDateFormat dnt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println("Today Date & Time at Now :" + dnt.format(date));
    }


    public static void main(String[] args) {


        countVowelsAndConsonants("#Hello");
        //removeDuplicates("bananas bananas");

    }

}
