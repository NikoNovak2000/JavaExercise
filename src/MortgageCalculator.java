import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal = 0;
        float annualInterestRate = 0;
        byte periodInYears = 0;
        float monthlyInterestRate = 0;
        float periodInMonths = 0;

                Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Enter a value between 1,000 and 1,000,000:");
            principal = scanner.nextInt();
            if (principal > 1_000 && principal < 1_000_000){
                break;
            }
            System.out.println("Error. Enter a value between 1,000 and 1,000,000.");
        }

        while (true){
            System.out.print("Enter a value between 1 and 30:");
            annualInterestRate = scanner.nextFloat();
            if (annualInterestRate >= 1 && annualInterestRate <= 30){
                monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR; // monthly interest rate
                break;
            }
            System.out.println("Error. Enter a value between 1 and 30.");
        }

        while (true){
            System.out.print("Enter period (years): ");
            periodInYears = scanner.nextByte();
            if (periodInYears >= 1 && periodInYears <= 30){
                periodInMonths = periodInYears * MONTHS_IN_YEAR; // period in months
                break;
            }
            System.out.println("Error. Enter a value between 1 and 30.");
        }

        double mortgage = principal * ( monthlyInterestRate * (Math.pow(1 + monthlyInterestRate,periodInMonths)) / (Math.pow(1 + monthlyInterestRate, periodInMonths) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage equals to: " + mortgageFormatted);
    }
}

// Mortgage Calculator
// 1st question: Principal/amount of loan (P)
// 2nd question: Annual interest rate (r) divide by 100 because it's a percent and by 12 because we need monthly interest rate
// 3rd question: Period (years) (n) * 12 for monthly
// answer: mortgage (M)

// M = P * ( r * (1 + r)pow n / (1 + r)pow n - 1)
