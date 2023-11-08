package BasicPrgrams.Competative;

public class FindMinArrayValur {
    public static void main(String[] args) {
        String message = "z Hello";
        char[] chars = message.toLowerCase().toCharArray();
        char ch = ' ';

        for (int loop=0;loop<=chars.length-1;loop++){
            if (ch<chars[loop]){
                ch=chars[loop];
            }
        }

        System.out.println(ch);
    }
}
