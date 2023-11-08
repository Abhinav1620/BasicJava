package BasicPrgrams.StarPrinting;

public class Star1 {
    public static void main(String[] args) {
        int number = 5;
        for(int row=0;row<=number;row++){
            for (int column=0;column<=row;column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
