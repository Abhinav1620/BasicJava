import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String message = "himanshu";
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

        for (Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey()+" repeated: "+entry.getValue()+" times");
        }


    }
}