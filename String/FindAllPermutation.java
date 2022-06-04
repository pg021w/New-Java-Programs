package String;

public class FindAllPermutation {


    static void printPermutn(String ques, String asf) {


        if(ques.length()==0){
            System.out.println("Result : " + asf);
        }

        for (int i = 0; i < ques.length(); i++) {
            System.out.println("ques : " + ques);
            char ch = ques.charAt (i);
            String qlPart = ques.substring(0,i);
            String qrPart = ques.substring(i+1);
            String req = qlPart+qrPart;
            System.out.println("roq : " + req);
            System.out.println("asf : " + asf+ch);
            printPermutn(req, asf+ch);
        }
    }

    public static void main(String[] args) {

        printPermutn("abc", "");

    }


}
