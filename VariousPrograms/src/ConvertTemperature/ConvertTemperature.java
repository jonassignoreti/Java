package ConvertTemperature;

import java.util.Scanner;

public class ConvertTemperature {
    static double celsiusFahrenheit(double c){
        return 9*c/5+32;
    }
    static double fahrenheitCelsius(double f){
        return (f-32)*5/9;
    }

    public static void main(String[] args){
        double fahrenheit, celsius;
        Scanner input = new Scanner(System.in);

        System.out.print("TYPE THE TEMPERATURE IN FAHRENHEIT: ");
        fahrenheit = input.nextDouble();
        celsius = fahrenheitCelsius(fahrenheit);
        System.out.println(fahrenheit + "° F >>> " + celsius + "° C");

        System.out.print("TYPE THE TEMPERATURE IN CELSIUS: ");
        celsius = input.nextDouble();
        fahrenheit = celsiusFahrenheit(celsius);
        System.out.println(celsius + "° C >>> " + fahrenheit + "° F");
    }
}