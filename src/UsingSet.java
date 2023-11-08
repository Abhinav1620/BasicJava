import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UsingSet {
    public static void main(String[] args) {
        String message = "abhinav";
        int count=1;
        char[] msg = message.toCharArray();
        Set<String> set = new HashSet<String>();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] newMessage = message.toCharArray();
        for (Character ch: newMessage){
            if (map.containsKey(ch)){
//                map.put(ch, map.get(ch)+1);
                System.out.println(ch+": character is repeating removing from list");
                map.remove(ch);
            }
            else {
                map.put(ch, 1);
            }
        }
        for (Map.Entry entry:map.entrySet()) {
            set.add(entry.toString());
        }
        System.out.println(set);
    }
}
