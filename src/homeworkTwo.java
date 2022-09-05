public class homeworkTwo {

    public static void main(String[] args) {

        int entradaArg = Integer.parseInt(args[0]);

        if (entradaArg % 2 == 1) {
            System.out.printf("O numero %d eh impar", entradaArg);
        } else {
            System.out.printf("O numero %d eh par", entradaArg);
        }
    }
}