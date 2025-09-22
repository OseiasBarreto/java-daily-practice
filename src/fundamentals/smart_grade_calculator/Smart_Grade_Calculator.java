// Descrição: o programa lê 5 notas de um aluno, calcula a média final e exibe o resultado.
package fundamentals.smart_grade_calculator;
import java.util.Scanner;

public class Smart_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Bem vindo ao NOTAS FINAIS");
        System.out.println("Informe as 5 notas do aluno: ");

        System.out.print("nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.print("nota 3: ");
        double nota3 = sc.nextDouble();

        System.out.print("nota 4: ");
        double nota4 = sc.nextDouble();

        System.out.print("nota 5: ");
        double nota5 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

        System.out.println("A média final do aluno é: " + media);

    }
}

