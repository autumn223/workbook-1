import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user how much the loan is
        System.out.print("Enter loan amount (principal): ");
        double principal = scanner.nextDouble(); // Save it in a variable

        // Ask what the interest rate is (like 7.5)
        System.out.print("Enter annual interest rate (%): ");
        double annualRate = scanner.nextDouble() / 100; // Convert from percent to decimal

        // Ask how many years the loan lasts (like 15 or 30)
        System.out.print("Enter loan term in years: ");
        int years = scanner.nextInt(); // Save it

        // Calculate how many monthly payments there are in total
        int totalPayments = years * 12;

        // Calculate the monthly interest rate (not yearly)
        double monthlyRate = annualRate / 12;

        // Now we use the special mortgage formula to figure out monthly payment
        // Formula: M = P * (i * (1 + i)^n) / ((1 + i)^n - 1)
        double numerator = monthlyRate * Math.pow(1 + monthlyRate, totalPayments);
        double denominator = Math.pow(1 + monthlyRate, totalPayments) - 1;
        double monthlyPayment = principal * (numerator / denominator);

        // Calculate the total interest = everything you paid - original loan
        double totalInterest = (monthlyPayment * totalPayments) - principal;

        // Show the answers (rounded to 2 decimal places)
        System.out.printf("Monthly Payment: $%.2f%n", monthlyPayment);
        System.out.printf("Total Interest Paid: $%.2f%n", totalInterest);


    }
}
