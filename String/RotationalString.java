package String;

public class RotationalString {

    public static void isRotational(String input, String inputRev) {

        System.out.println("Check : " + input+input);


        if((input.length()==inputRev.length()) && (input+input).contains(inputRev)) {

            System.out.print("One string is rotation of other");
        }

        else {
            System.out.print("One string is not rotation of other");

        }

    }


    public  static  void main(String args[]) {

        isRotational("bcda", "abcd");
    }

}
