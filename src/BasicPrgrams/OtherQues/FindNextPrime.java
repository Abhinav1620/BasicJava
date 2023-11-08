package BasicPrgrams.OtherQues;

public class FindNextPrime {
    public static void main(String[] args) {
        int number=60;

        for(int loop=2;loop<number;loop++){
            if (number%loop==0){
                number=number+1;
                loop=2;
            }
        }

        System.out.println(number);
    }
}
