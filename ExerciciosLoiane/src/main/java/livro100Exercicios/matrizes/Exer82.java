package livro100Exercicios.matrizes;
import java.util.Random;
import java.util.Scanner;
/*
faça um programa que preencha uma matriz 4x4 com
valores aleatório e exiba a matriz transposta
 */

public class Exer82 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        //preenchendo a matriz com valores aleatórios
        Random random = new Random();
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < matriz.length; i++){
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }

        //calculando e exibindo a matriz transposta
        int[][] matrizTransposta = new int[4][4];
        for(int i = 0; i< matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz transposta");
        for(int i = 0; i <4; i++){
            for(int j = 0; j <4; j++){
                System.out.println(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
