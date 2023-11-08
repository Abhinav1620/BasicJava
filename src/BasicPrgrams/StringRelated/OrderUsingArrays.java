package BasicPrgrams.StringRelated;

import java.util.Arrays;

public class OrderUsingArrays {

    public static void main(String[] args) {


        String message = "Gupta";


        char[] ch = message.toLowerCase().toCharArray();
        Arrays.sort(ch);

        for (char ch01: ch){
            System.out.print(ch01);
        }
    }
}
