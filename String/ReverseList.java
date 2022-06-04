package String;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseList {

    public static void reverse() {

        LinkedList<String> list = new LinkedList<>();
        list.add("ta");
        list.add("ki");
        list.add("an");

        for (int i = 0, j = list.size() - 1; i < j; i++) {

            list.add(i, list.remove(j));
        }

        System.out.println("List: " + list);


    }

    public static void main(String args[]) {

        reverse();

    }
}
