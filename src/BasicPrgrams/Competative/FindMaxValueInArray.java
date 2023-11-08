package BasicPrgrams.Competative;

public class FindMaxValueInArray {
    public static void main(String[] args) {
        int[] in = {2,11,7,5,3,9};
        int max = 0;

        for (int loop=0;loop<= in.length-1;loop++){
            if (max<in[loop]){
                max=in[loop];
            }
        }

        System.out.println(max);
    }
}
