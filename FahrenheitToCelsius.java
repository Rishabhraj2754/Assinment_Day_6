import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        float Fahrenheit;
        float Celsius;
        System.out.println("Enter the temp in Fahrenheit:");
        Scanner scanner = new Scanner(System.in);

        Fahrenheit = scanner.nextFloat();
        Celsius  = ((Fahrenheit-32)*5)/9;
        System.out.println("Temperature in celsius is: "+Celsius);
        }
}
