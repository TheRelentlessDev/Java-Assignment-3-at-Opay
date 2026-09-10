import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 3 ; i++){
            System.out.print("Enter Citizens Name: ");
            String name = scanner.next();
            System.out.print("Enter Earnings: ");
            float earnings = scanner.nextFloat();


            float totalTax1 = (((float)15 / 100)*(earnings));
            float totalTax2 = (((float) 20/ 100)*(earnings));

            if( earnings <= 30000){
                System.out.printf( name + " Total Tax is = " + totalTax1 + "$" +"%n");
            }else {
                System.out.printf( name + " Total Tax is =" + totalTax2 + "$" +"%n");
            }
        }




    }
}




