package BasicPrgrams;

public class Prime {
    public static void main(String[] args) {

        int number = 123, originalNumber, reverse=0;
        originalNumber=number;

        while (number>0){
            reverse=reverse*10+number%10;
            number=number/10;
        }

        if (reverse==originalNumber){
            System.out.println("Number is Palindrome");
        }
        else {
            System.out.println("Number is not a palindrome");
        }

    }
}
