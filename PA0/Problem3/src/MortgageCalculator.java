 import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {

        double p = 0;
        double i = 0;
        int n;
        Scanner s = new Scanner(System.in);

        System.out.println("Principal loan amount:");

        // Input validation for Principal
        boolean isValid = false;
        while (!isValid) {
            if (s.hasNextDouble()) {
                p = s.nextDouble();
                if (p >= 10000.0 && p <= 500000.0) {
                    isValid = true;
                }
            }
            else {
                System.out.println("Error Principal loan must be a double between 10k and 500k, please enter a valid amount: ");
                s.nextLine();
            }
        }

        System.out.println("Annual interest rate:");
        // Monthly interest rate calculated from annual interest rate
        i = s.nextDouble() / 12 * .01;

        System.out.println("Number of months:");
        n = s.nextInt();
        System.out.printf("Monthly payment: %.2f", calculateMortgage(p, i, n));
    }

    // Method to calculate monthly mortgage payment
    static double calculateMortgage(double p, double i, int n) {
        return ( p * (i * Math.pow((1+i), n)) ) / (Math.pow((1+i), n) - 1) ;
    }
}