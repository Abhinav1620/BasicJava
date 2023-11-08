package BasicPrgrams;

public class Factorials {
    public static void main(String[] args) {
        int number = 5, factorial=1;

        while (number>0){
            factorial=factorial*number;
            number=number-1;
        }

        System.out.println(factorial);

    }
}
