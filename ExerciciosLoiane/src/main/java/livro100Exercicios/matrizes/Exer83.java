package livro100Exercicios.matrizes;
import java.util.Scanner;
/*
faça um programa que leia duas matrizes 2x2 e exiba a soma das duas matrizes
 */

public class Exer83 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
         int[][] matriz1 = new int[2][2];
         int[][] matriz2 = new int[2][2];
         int[][] matrizResultado  = new int[2][2];

         System.out.println("Digite o valores da primeira matriz");
         for(int i = 0; i < matriz1.length; i++){
             for(int j = 0; j < matriz1.length; j++){
                 matriz1[i][j]= scan.nextInt();
             }
         }

         System.out.println("Digite o valores da segunda matriz");
         for(int i = 0; i < matriz2.length; i++){
             for(int j = 0; j < matriz2.length; j++){
                 matriz2[i][j] = scan.nextInt();
             }
         }

         for(int i = 0; i < 2;i++){
             for(int j = 0; j < 2; j++){
                 matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
             }
         }

         //exibindo a matriz resultado
        System.out.println("A matriz soma é: ");
         for(int i = 0; i<2; i++){
             for(int j = 0; j < 2; j++){
                 System.out.println(matrizResultado[i][j]);
             }
         }

    }
}
