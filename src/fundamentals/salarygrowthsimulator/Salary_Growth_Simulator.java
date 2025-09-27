package fundamentals.salarygrowthsimulator;
import java.util.Scanner;

public class Salary_Growth_Simulator {
    public static void  main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------------------------------------");
        System.out.println("Bem vindo ao simulador de crescimento salarial!");
        System.out.println("-----------------------------------------------");

        System.out.println("Informe o seu salário atual e quantos % de aumento salarial você deseja simular");
        System.out.println("salário: ");
        double salario = sc.nextDouble();

        System.out.println("Aumento: ");
        double aumento = sc.nextDouble();


        System.out.println("Seu salário é: " + salario + "R$"+  " e você deseja um aumento de " + aumento + "%");
        System.out.println("Seu aumento salarial será de: " + porcentagem(salario, aumento) + "R$");
    }
//metodo para calcular aumento salarial
    public static double porcentagem (double salario, double aumento){
        return (salario * aumento) / 100;
    }

}
