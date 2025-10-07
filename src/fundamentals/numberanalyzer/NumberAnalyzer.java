package fundamentals.numberanalyzer;


import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("PAR OU ÍMPAR");
        System.out.println("Digite um número: ");
        int n = sc.nextInt();



        analisadorDeNumero(n);
        sc.close();
    }



    private static void analisadorDeNumero (int x) {
        String sinal;
        if (x > 0){
            sinal = "positivo";
        } else if (x < 0) {
            sinal = "negativo";
        } else {
            sinal = "!zero!";
        }


        if (x % 2 == 0)  {
            System.out.println(x + " é par e é um número " + sinal)  ;
        } else {
            System.out.println(x + " é ímpar e é um número " + sinal);
        }
    }
}



