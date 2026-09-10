import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int number;
        int largest = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter Number: " );
            number = scanner.nextInt();

            if (number > largest) {

                largest = number;
            }
        }
        System.out.print("Largest Number is =" + largest);
    }
}

