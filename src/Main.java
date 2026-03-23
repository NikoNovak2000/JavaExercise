import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal: ");
        int principal = scanner.nextInt();

        System.out.print("Enter annual interest rate: ");
        float annualInterestRate = scanner.nextFloat();

        System.out.print("Enter period (years): ");
        byte periodInYears = scanner.nextByte();

        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR; // monthly interest rate
        float periodInMonths = periodInYears * MONTHS_IN_YEAR; // period in months
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