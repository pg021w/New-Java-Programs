package Integer;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class AddNumberOfAnyLength {

    public void add(String a , String b){

        BigInteger p = new BigInteger(a);
        BigInteger q = new BigInteger(b);


        System.out.println("Sum + " + p.add(q));

    }

    public void addAnother(int[] a, int[] b){

        ArrayList<Integer> list =  new ArrayList<>();

        for(int i =0; i<a.length; i++){

            list.add(a[i] + b[i]);
        }
        System.out.println("List before : " + list);


        for(int k=list.size()-1; k>0;k--){
            System.out.println("in loop : " + list.get(k));

            if(list.get(k)>9){

                int p = list.get(k-1)+list.get(k)/10;
                System.out.println("p : " + p);
                int q = list.get(k)%10;
                System.out.println("q : " + q);
                list.set(k,q);
                list.set(k-1,p);



            }
        }

        System.out.println("List : " + list);


    }

    public static void main(String args[]) {

        AddNumberOfAnyLength any = new AddNumberOfAnyLength();

        any.addAnother(new int[]{9, 8, 0, 7, 8, 9}, new int[]{9, 5, 9, 8, 7, 9});
        any.add("9876543210", "1234567890");
    }

}
