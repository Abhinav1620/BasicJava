package BasicPrgrams.StringRelated;

public class OrderUsingVariable {
    public static void main(String[] args) {


        String message = "Gupta";
        char temp;
        char[] ch = message.toLowerCase().toCharArray();

        for(int loop=0;loop<ch.length-1;loop++){
            for (int sec=loop+1;sec<=ch.length-1;sec++) {

                if (ch[loop] < ch[sec]) {
                    temp=ch[loop];
                    ch[loop]=ch[sec];
                    ch[sec]=temp;
                }
            }
        }

        for(char ch01:ch){
            System.out.print(ch01);
        }

    }
}
