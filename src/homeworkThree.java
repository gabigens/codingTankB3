import java.util.Scanner;

public class homeworkThree {

    public static void main(String[] args) {

        Scanner entradaSystem = new Scanner(System.in);
        double entrada1;
        double entrada2;

        switch (args.length) {
            case 0:
                System.out.println("Digite 2 numeros");
                entrada1 = entradaSystem.nextDouble();
                entrada2 = entradaSystem.nextDouble();
                break;
            case 1:
                System.out.println("Digite 1 numero");
                entrada1 = entradaSystem.nextDouble();
                entrada2 = Double.parseDouble(args[0]);
                break;
            case 2:
                entrada1 = Double.parseDouble(args[0]);
                entrada2 = Double.parseDouble(args[1]);
                break;
            default:
                System.out.println(" A quantidade informada nao e valida");
                return;
        }

        System.out.printf("A soma e igual a %f", entrada1 + entrada2);
    }
}