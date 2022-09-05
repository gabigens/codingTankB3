//public class segundo {
//
//    public static void main(String[] args) {
//        initialize();
//
//        UnityTemp unityInput = getUnityTemp("entrada");
//        UnityTemp unityOutput = getUnityTemp("saída");
//
//        toCelsiusTransform(UnityTemp.KELVIN, 10);
//        toCelsiusTransform(UnityTemp.CELSIUS, 10);
//
//
//        double temp = getDouble();
//        double fahrenheit = toFahrenheitTransform(temp);
//
//        System.out.printf("O resultado da conversão é %f", fahrenheit);
//    }
//
//    private static UnityTemp getUnityTemp(String nomeQualquerDeVariavel) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Digite a unidade de temperatura de " + nomeQualquerDeVariavel);
//        String typeString = input.nextLine();
//        return UnityTemp.valueOf(typeString);
//    }
//
//    private static void initialize() {
//        System.out.println("Bem vindo ao nosso conversor de temperaturas.");
//    }
//
//    private static double getDouble() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Digite um número real: ");
//        return input.nextDouble();
//    }
//
//    public static double toFahrenheitTransform(double celsius) {
//        return celsius * 9.0 / 5 + 32;
//    }
//
//    public static double toCelsiusTransform(UnityTemp type, double temp) {
//        if (type == UnityTemp.FAHRENHEIT) {
//            return (temp - 32) / 1.8;
//        } else if(type == UnityTemp.KELVIN) {
//            return temp - 273.15;
//        } else {
//            return temp;
//        }
//    }
//}
