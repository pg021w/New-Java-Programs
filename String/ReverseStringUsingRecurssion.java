package String;

public class ReverseStringUsingRecurssion {

    public void reverse(String s) {

        if ((s == null) || (s.length() <= 1)) {
            System.out.print(s);

        } else {
            System.out.print(s.charAt(s.length() - 1));
            reverse(s.substring(0, s.length() - 1));
        }


    }


    public static void main(String args[]) {

        ReverseStringUsingRecurssion rev = new ReverseStringUsingRecurssion();
        rev.reverse("Ankita Singh");

    }
}
