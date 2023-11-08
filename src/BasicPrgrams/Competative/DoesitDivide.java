package BasicPrgrams.Competative;

public class DoesitDivide {
    public static void main(String[] args) {

        int number1=2, number2=2, sum=number1+number2, prod=number1*number2;

        if (prod%sum==0){
            System.out.println("prod is divisible by sum");
        }
        else {
            System.out.println("prod is not divisible by sum");
        }

    }
}
