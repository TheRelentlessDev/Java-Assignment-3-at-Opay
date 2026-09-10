import java.util.Scanner;
public class SalesComCal {
    public static void main(String[] args) {
        float weeklyPay;
        int itemNo = 0;
        float amountOfItemSold;
        float commissionPercentage = 0;
        float commissionEarning = 0;
        float totalAmountOfItemSold = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter Weekly Pay (or -1 to quit)  %n");
        System.out.print("Enter weekly pay: ");
        weeklyPay = scanner.nextFloat();
        if(weeklyPay==-1){
            return;
        }
        System.out.print("Enter Commission Percentage: ");
        commissionPercentage = scanner.nextFloat();


        while(true){
            System.out.print("Enter Amount of Item Sold: ");
            amountOfItemSold = scanner.nextFloat();
            if(amountOfItemSold == -1 ){
                break;
            }


            totalAmountOfItemSold += amountOfItemSold;

        }
        commissionEarning = (commissionPercentage/100)*(totalAmountOfItemSold);
        System.out.printf("Earning from Sales Commission = " + commissionEarning +"$ %n");


        if(commissionEarning > 0){
            float totalEarning =  commissionEarning + weeklyPay;
            System.out.print("Total Earning is = " + totalEarning +"$");

        }



    }
}
