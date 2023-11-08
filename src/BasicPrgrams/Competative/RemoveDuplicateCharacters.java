package BasicPrgrams.Competative;
import java.util.HashSet;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String str = "Hello";
        char[] ch = str.toLowerCase().toCharArray();
        HashSet<Character> map = new HashSet<Character>();

        for (int loop=0;loop<= ch.length-1;loop++){
            if (map.contains(ch[loop])){
                map.remove(ch[loop]);
            }
            else {
                map.add(ch[loop]);
            }
        }

        for (char ch01: map){
            System.out.println(ch01);
        }
    }
}
