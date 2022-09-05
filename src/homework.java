import java.util.Scanner;

public class homework {

    public static double fahrenheit(double celsius){
        final double fator1 = 9.0/5.0;
        final double fator2 = 32.0;
        return (celsius * fator1) + fator2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a temperatura 1 em ºC");
        double celsius = input.nextDouble();
        double fahrenheit = fahrenheit(celsius);

        System.out.println("A conversão de " + celsius + "ºC é igual a: " + fahrenheit + "ºF");

        System.out.println("Informe a temperatura 2 em ºC");
        celsius = input.nextDouble();
        fahrenheit = fahrenheit(celsius);

        System.out.println("A conversão de " + celsius + "ºC é igual a: " + fahrenheit + "ºF");
        }
}


