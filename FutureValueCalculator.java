import java.util.Scanner;

public class FutureValueCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask the user how much money they're putting in the bank
        System.out.print("Enter the deposit amount: ");
        double principal = scanner.nextDouble(); // Save the amount

        // Ask what the yearly interest rate is (like 1.75%)
        System.out.print("Enter the annual interest rate (%): ");
        double annualRate = scanner.nextDouble() / 100; // Turn it into a decimal

        // Ask how many years the money will sit in the bank
        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        // We're using daily compounding, so interest is added every day
        int daysPerYear = 365; // How many days in a year
        int totalDays = years * daysPerYear; // Total number of days

        // Here's the magic money-growing formula:
        // FV = P * (1 + (r / 365)) ^ (365 * t)
        double futureValue = principal * Math.pow(1 + (annualRate / daysPerYear), totalDays);

        // Figure out how much extra money was earned
        double interestEarned = futureValue - principal;

        // Show the user how much money they’ll have and how much it grew
        System.out.printf("Future Value: $%.2f%n", futureValue);
        System.out.printf("Total Interest Earned: $%.2f%n", interestEarned);
    }
}
