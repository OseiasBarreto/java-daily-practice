package fundamentals.matriz1;

import java.util.Scanner;

public class Matriz01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite valor de N e M");
        System.out.print("Valor de l: ");
        int l = sc.nextInt();
        System.out.print("Valor de c: ");
        int c = sc.nextInt();

        System.out.println("Digite os elementos da matriz: ");

        int[][] mat = new int[l][c];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("ELEMENTO [" +i + "] [" +j+ "] ");
               mat[i][j] = sc.nextInt() ;
            }
        }
        System.out.println("Matriz lida:");

        for(int i = 0; i < l; i++){
            for( int j = 0; j  < c; j++){
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
