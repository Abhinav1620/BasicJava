package BasicPrgrams.StringRelated;

public class UsingStringBuffer {
    public static void main(String[] args) {
        String message = "Nittin", originalMessage;
        originalMessage=message;

        StringBuffer buffer = new StringBuffer(message);
        if (buffer.reverse().toString().equalsIgnoreCase(originalMessage)){
            System.out.println("Message is palindrome");
        }
        else {
            System.out.println("Message is not a palindrome");
        }
    }
}
