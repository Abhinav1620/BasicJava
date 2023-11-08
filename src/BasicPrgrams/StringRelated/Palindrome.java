package BasicPrgrams.StringRelated;

public class Palindrome {
    public static void main(String[] args) {
        String message = "Naman", msg="", originalMsg;
        originalMsg=message;
        for (int loop=message.length()-1;loop>=0;loop--){
            msg=msg+message.charAt(loop);
        }
        if (msg.equalsIgnoreCase(originalMsg)){
            System.out.println("Text is palindrome");
        }
        else {
            System.out.println("Text is not a palindrome");
        }
    }
}
