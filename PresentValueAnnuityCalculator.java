import java.util.Scanner;

public class PresentValueAnnuityCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Ask the user how much they want to get every month in the future
        System.out.print("Enter the monthly payout: ");
        double monthlyPayout = scanner.nextDouble();

        // Ask how much interest the money earns every year
        System.out.print("Enter the expected annual interest rate (%): ");
        double annualRate = scanner.nextDouble() / 100; // turn % into a decimal

        // Ask how many years they want to get the money
        System.out.print("Enter number of years for the payout: ");
        int years = scanner.nextInt();

        // Figure out how many total payments they'll receive
        int totalPayments = years * 12;

        // Turn the yearly rate into a monthly rate
        double monthlyRate = annualRate / 12;

        // Now use the math formula for present value of an annuity:
        // PV = Pmt × [1 - (1 + r)^-n] / r
        // Pmt = monthly payment
        // r = monthly interest rate
        // n = total number of payments

        // Do the math part step-by-step so it's not too confusing
        double power = Math.pow(1 + monthlyRate, -totalPayments); // this handles (1 + r)^-n
        double presentValue = monthlyPayout * (1 - power) / monthlyRate;

        // Show the user how much they need to invest today
        System.out.printf("Present Value (amount to invest today): $%.2f%n", presentValue);
    }
}
