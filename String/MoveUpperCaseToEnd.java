package String;

public class MoveUpperCaseToEnd {

    public static String move(String input) {

        return input.replaceAll("[A-Z]+", "") + input.replaceAll("[^A-Z]+", "");


    }


    public static void main(String args[]) {

        System.out.println(move("AnKitA"));
    }
}
