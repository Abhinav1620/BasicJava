package BasicPrgrams.OtherQues;

public class RepeateCh {
    public static void main(String[] args) {
        String message = "Hello World";
        char[] ch = message.toLowerCase().toCharArray();
        char ch01='o';
        int count=0;

        for (char ch02: ch){
            if (ch02==ch01){
                count++;
            }
        }

        System.out.println(count);
    }
}
