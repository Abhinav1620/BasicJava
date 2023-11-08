package BasicPrgrams.StarPrinting;

public class Star03 {
    public static void main(String[] args) {
        int number =5;
        for (int row=0;row<=number;row++){
            for (int space=0;space<row;space++){
                System.out.print(" ");
            }

            for (int column=number-row;column>=0;column--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
