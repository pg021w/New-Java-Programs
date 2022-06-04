package Integer;

public class ReverseNegativeInteger {

    public int reverse(int x) {

        String s = String.valueOf(x);

        String result = "";
        String subs;


        if (s.contains("-")) {

            subs = s.substring(1, s.length());
            System.out.println("subs : " + subs);
            for (int i = subs.length() - 1; i >= 0; i--) {

                result = result + subs.charAt(i);

            }
        } else {
            for (int i = s.length() - 1; i >= 0; i--) {

                result = result + s.charAt(i);

            }
        }


        int rev = Integer.parseInt(result);

        if (String.valueOf(x).contains("-")) {

            return rev * (-1);
        } else {

            return rev;
        }


    }


    public static void main(String args[]) {

        ReverseNegativeInteger rev = new ReverseNegativeInteger();

        System.out.println("Rev: " + rev.reverse(-150));

    }
}
