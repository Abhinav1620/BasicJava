package BasicPrgrams.OtherQues;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int[] num = {4,7,2,6,8,3};
        int temp=num[0];

        for (int loop=0;loop<num.length-1;loop++){
            if (num[loop]>num[0]){
                temp=num[loop];
            }
        }

        System.out.println(temp);
    }
}
