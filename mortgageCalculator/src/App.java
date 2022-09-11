package mortgageCalculator.src;
import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        final Byte MONTHS_IN_YEAR = 12;
        final Byte PERCENT = 100;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Principal: ");
            int principal = scanner.nextInt();

            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            float montlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

            System.out.println("Period (Years): ");
            byte years = scanner.nextByte();
            int numberOfPayments = years * MONTHS_IN_YEAR;

            double mortgage = principal * 
            (montlyInterest * Math.pow(1 + montlyInterest, numberOfPayments)) 
            / Math.pow(1 + montlyInterest, numberOfPayments);

            String mortgageFormatted = 
            NumberFormat.getCurrencyInstance().format(mortgage);

            System.out.println("Mortgage: " + mortgageFormatted);
        }

    }
}
