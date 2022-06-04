package String;

public class RemoveSubsetOfString {


    public static void removeSubset(String ogString, String subSet) {

        char[] og = ogString.toCharArray();
        char[] sub = subSet.toCharArray();

        for (int i = 0; i < og.length; i++) {

            for (int j = 0; j < sub.length; j++) {

                if (subSet.charAt(j) == ogString.charAt(i)) {

                    og[i] = 0;

                }

            }

        }

        for (int i = 0; i < og.length; i++) {

            if (!(og[i] == 0)) {
                System.out.print(og[i]);
            }
        }


    }

    public static void main(String args[]) {

        removeSubset("India is great", "in");

    }
}
