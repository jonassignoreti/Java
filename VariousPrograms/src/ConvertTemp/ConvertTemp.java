package ConvertTemp;

import java.util.Scanner;

public class ConvertTemp {
    static double celsinhoFahr(double c){
        double f = 9*c/5+32;
        return f;
    }
    static double farhCelsinho(double f){
        double c = (f-32)*5/9;
        return c;
    }

    public static void main(String[] args){
        double fahrenheit, celsius;
        Scanner leitura = new Scanner(System.in);

        System.out.print("Indique a temperatura em Fahrenheit: ");
        fahrenheit = leitura.nextDouble();
        celsius = farhCelsinho(fahrenheit);
        System.out.println("corresponde a " + celsius + "° C");

        System.out.print("Indique a temperatura em Celsius: ");
        celsius = leitura.nextDouble();
        fahrenheit = celsinhoFahr(celsius);
        System.out.println("corresponde a " + fahrenheit + "° F");
    }
}