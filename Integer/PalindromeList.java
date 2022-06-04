package Integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromeList {


    public static void solution(int[] a) {

        ArrayList<Integer> list = new ArrayList(Arrays.asList(a));
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        for (int i = 0, j = list.size() - 1; i < j; i++) {
            list2.add(i, list.remove(j));
        }


        if(list==list2){
            System.out.println("Its a palindrome");
        }

        else{
            System.out.println("Its not a palindrome");

        }
    }

    public static void main(String args[]) {

        solution(new int[]{1, 2, 1});
    }
}
