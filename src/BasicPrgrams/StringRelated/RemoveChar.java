package BasicPrgrams.StringRelated;

import java.util.HashMap;

public class RemoveChar {
    public static void main(String[] args) {
        String message = "abhinav", newMessage="";
        char[] msg = message.toCharArray();


        for (int loop=0;loop<=message.length()-1;loop++){
            for (int loop2=loop+1;loop2<=message.length()-1;loop2++){
                if (msg[loop]==msg[loop2]){
                    msg[loop]=msg[loop+1];
                    newMessage=newMessage+msg[loop];
                }
            }
        }

        System.out.println(newMessage);

    }
}
