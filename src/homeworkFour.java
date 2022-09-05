import java.util.Scanner;

public class homeworkFour {

    public static void main(String[] args) {

        Scanner entradaSystem = new Scanner(System.in);
        System.out.println("Informe um numero");
        double entrada1 = entradaSystem.nextDouble();
        System.out.println("O que deseja fazer: somar, subtrair, multiplicar ou dividir? Informe o sinal da oeracao desejada");
        String operacao = entradaSystem.next();
        System.out.println("Informe o segundo numero");
        double entrada2 = entradaSystem.nextDouble();

        System.out.printf("O resultado e igual a %f", calcular(entrada1,entrada2,operacao));
    }

    public static double calcular (double entrada1, double entrada2, String operacao) {

        switch (operacao) {
            case "+":
                return entrada1 + entrada2;
            case "-":
                return entrada1 - entrada2;
            case "*":
                return entrada1 * entrada2;
            case "/":
                return entrada1 / entrada2;
            default:
                throw new RuntimeException("Operacao invalida");
        }
    }
}