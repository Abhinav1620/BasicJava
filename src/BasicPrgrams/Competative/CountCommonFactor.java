package BasicPrgrams.Competative;

public class CountCommonFactor {
    public static void main(String[] args) {
        int number=300, count=0;

        for (int loop=2;loop<number;loop++){
            if (number%loop==0){
                count++;
            }
        }

        System.out.println(count);
    }
}
