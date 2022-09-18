package mortgageCalculator.src;

import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final Byte MONTHS_IN_YEAR = 12;
        final Byte PERCENT = 100;

        int principal = 0;
        float montlyInterest = 0;
        int numberOfPayments = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Principal(1K - 100K): ");
                principal = scanner.nextInt();
                if (principal >= 1000 && principal <= 1_000_000)
                    break;
                System.out.println("Enter a value between 1K and 1M");
            }

            while (true) {
                System.out.print("Annual Interest Rate: ");
                float annualInterest = scanner.nextFloat();
                if (annualInterest >= 1 && annualInterest <= 30) {
                    montlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                    break;
                }
                System.out.println("Enter a value between 1 and 30");

            }

            while (true) {
                System.out.print("Period (Years): ");
                byte years = scanner.nextByte();
                if (years >= 1 && years <= 30) {
                    numberOfPayments = years * MONTHS_IN_YEAR;
                    break;
                }
                System.out.println("Enter a value between 1 and 30");

            }

            double mortgage = principal *
                    (montlyInterest * Math.pow(1 + montlyInterest, numberOfPayments))
                    / Math.pow(1 + montlyInterest, numberOfPayments);

            String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

            System.out.println();
            System.out.println("Mortgage: " + mortgageFormatted);
        }

    }
}
