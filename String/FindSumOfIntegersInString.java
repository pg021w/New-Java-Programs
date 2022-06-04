package String;


public class FindSumOfIntegersInString {


    public static void sum(String sample) {


        int sum = 0;

        String temp = "0";


        for (int i = 0; i < sample.length(); i++) {

            char ch = sample.charAt(i);

            if (Character.isDigit(ch)) {

                temp += ch;
                System.out.println("Temp : " + temp);

            } else {

                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }

        sum += Integer.parseInt(temp);

        System.out.println("Sum : " + sum);


    }

    public static void main(String[] args) {

        sum("12abc20yz68");

    }

}
