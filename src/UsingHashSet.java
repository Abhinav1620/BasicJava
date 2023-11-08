import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UsingHashSet {
    public static void main(String[] args) {
        String message  = "abhinav";
        char[] msg = message.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        HashSet<String> set = new HashSet<String>();
        for (Character ch: msg){
            if (map.containsKey(ch)){
//                map.put(ch, map.get(ch)+1);
                System.out.println(ch+": character is repeating removing from list");
                map.remove(ch);
            }
            else{
                map.put(ch, 1);
            }
        }
        for (Map.Entry entry: map.entrySet()){
            set.add(entry.toString());
        }
        for (String ms: set){
            System.out.println(ms);
        }
    }
}
