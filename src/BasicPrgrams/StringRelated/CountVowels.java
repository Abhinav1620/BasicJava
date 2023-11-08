package BasicPrgrams.StringRelated;

public class CountVowels {
    public static void main(String[] args) {

        String message = "Good Morning^#&^$^#&";
        char[] ch = message.toLowerCase().toCharArray(), chars = {'a', 'e', 'i', 'o', 'u'};;
        int count=0;

        for (int loop1=0;loop1<=ch.length-1;loop1++){
            for (int loop2=0;loop2<= chars.length-1;loop2++){
                if (chars[loop2]==ch[loop1]){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
