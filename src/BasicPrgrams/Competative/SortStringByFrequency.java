package BasicPrgrams.Competative;

import java.util.Arrays;

public class SortStringByFrequency {
    public static void main(String[] args) {

        String message = "Tree";
        char[] text = message.toLowerCase().toCharArray();

        Arrays.sort(text);


        for (char ch: text){
            System.out.print(ch);
        }
    }
}
