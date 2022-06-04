package String;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestNonRepeatedSubstring {


    public static void solution(String str) {

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        int ans = 0;
        int i = -1;
        int j = -1;

        while (true) {

            boolean f1 = false;
            boolean f2 = false;

            while (i < str.length() - 1) {

                f1 = true;
                i++;
                char ch = str.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                if(map.get(ch)==2){
                    break;
                }

                else{
                    int length = i-j;
                    if(length>ans) {
                        ans = length;
                    }
                }


            }

            while(j<i){
                f2=true;
                j++;
                char ch = str.charAt(j);
                map.put(ch, map.get(ch)-1);

                if(map.get(ch)==1) {
                    break;
                }
            }

            if(!f1 && !f2){
                break;
            }


        }

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : map.entrySet()){

            sb.append(entry.getKey());
        }

        System.out.println("Ans :  " + ans);
        System.out.println("Substring :  " + sb);


    }

    public static void main(String args[]) {


      solution("geeksforgeeks");

    }
}
