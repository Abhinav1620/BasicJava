package BasicPrgrams.StarPrinting;

public class Star02 {
    public static void main(String[] args) {
        int number=5;
        for (int row=number;row>0;row--){
            for (int column=row;column>0;column--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
