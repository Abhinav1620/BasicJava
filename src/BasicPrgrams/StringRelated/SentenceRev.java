package BasicPrgrams.StringRelated;

public class SentenceRev {
    public static void main(String[] args) {
        String message = "Hello good morning";
        String[] msg = message.split(" ");

        for (int loop=msg.length-1;loop>=0;loop--){
            System.out.print(msg[loop]+" ");
        }
    }
}
