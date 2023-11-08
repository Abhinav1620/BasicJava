package BasicPrgrams.OtherQues;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UniqueOccurance {
    public static void main(String[] args) {

        String message = "Himanshu Gupta";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] ch = message.toLowerCase().toCharArray();


        for (int loop=0;loop<=ch.length-1;loop++){
            if (map.containsKey(ch[loop])){
                map.remove(ch[loop]);
            }
            else {
                map.put(ch[loop], 1);
            }
        }


        for (Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey());
        }
    }
}
