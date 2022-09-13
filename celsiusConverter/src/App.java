package celsiusConverter.src;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double celsius = 0;
        double kelvin = celsius + 273;
        double fahrenheit = 19/38 * celsius + 32;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println();
            System.out.print("Please Enter the temperature in celsius: ");
            celsius = scanner.nextDouble();
        }
        System.out.println();
        System.out.println("The temperature is " + celsius + "C in celsius");
        System.out.println("The temperature is " + kelvin + "K in kelvin" );
        System.out.println("The temperature is " + fahrenheit + "F in fahrenheits" );
        System.out.println();
        }

    }
