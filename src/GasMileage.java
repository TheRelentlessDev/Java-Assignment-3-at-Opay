import java.util.Scanner;
public class GasMileage {
    public static void main(String[] args) {
        float miles;
        float gallons;
        float mpg;
        int tripCount = 0;
        float totalMiles = 0;
        float totalGallons = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Miles driven(or -1 to quit) ");
            while(true) {
                System.out.print("Enter Miles Driven: ");
                miles = scanner.nextFloat();
                if (miles == -1) {
                    break;
                }

                System.out.print("Enter gallons used: ");
                gallons = scanner.nextFloat();
                if (gallons <= 0) {
                    System.out.print("Invalid input!!! (Gallons cannot be less than or equal to 0)");
                    continue;
                }
                mpg = miles / gallons;

                tripCount++;
                totalMiles += miles;
                totalGallons += gallons;

                System.out.printf(" MPG for this trip: %.2f miles per gallon\n", mpg);
                System.out.println("-----------------------------------\n");
            }




                System.out.printf( "SUMMARY %n");
                System.out.println("The Trip count = " + tripCount);
                System.out.println("The Total Miles is = " + totalMiles);
                System.out.println("The Total Gallon is = " + totalGallons);

                if(tripCount > 0){
                float totalMpg = totalMiles / totalGallons;
                System.out.println("The total MPG is = " + totalMpg +" Milespergallon");
                }else{
                System.out.println("you have no Tripcount");
                }
                System.out.println("Goodbye");


    }
}
