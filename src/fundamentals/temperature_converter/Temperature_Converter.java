package fundamentals.temperature_converter;

import java.util.Scanner;

public class Temperature_Converter {
    public static void main(String[] args) {

        int opc;
        int sair;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Qual o valor em Celsius para converter?");
            int c = sc.nextInt();

            System.out.println("Converter " + c +"° graus Celsius para: ");
            System.out.println("");
            System.out.println("1 - Fahrenheit");
            System.out.println("2 - Kelvin");
            System.out.println("3 - Sair do programa");

            {

                opc = sc.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println(("O resultado foi : ") + convFahrenheit(c) + "°F");
                        break;

                    case 2:
                        System.out.println(("o resultado foi: ") +convKelvin(c) + "K");
                        break;

                    case 3:
                        System.out.println("SAINDO DO PROGRAMA...");
                        System.out.println("");

                    default:
                        System.out.println("Opção inválida. Tente novamente");
                        System.out.println("");
                }
            }
        } while (opc != 3);

    }


    public static int convFahrenheit(int celsius) {
        return ((celsius * 9 / 5) + 32);
    }

    public static double convKelvin (float celsius){
        return (celsius + 273.15);
    }


}
