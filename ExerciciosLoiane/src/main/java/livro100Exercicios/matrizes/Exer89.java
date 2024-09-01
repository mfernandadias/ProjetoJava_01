package livro100Exercicios.matrizes;
import java.util.Scanner;

public class Exer89 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        faça um programa que leia uma matriz 4x4 e verifique se ela é uma matriz diagonal,
        isto é, se todos os elementos fora da diagonal principal são iguais a zero
         */
        int tamanho = 4;
        int[][] matriz = new int[tamanho][tamanho];

        //System.out.println("Digite os elementos da que vai preencher a matriz");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.println("Digite o elemento da posição [" + i + "][" + j + "]");
                matriz[i][j] = scan.nextInt();
            }
        }

        boolean ehDiagonal = true;

        //verificação da diagonal
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if(i != j && matriz[i][j] != 0){
                    ehDiagonal = false;
                    break;
                }
            }
            if(!ehDiagonal){
                break;
            }
        }

        //exibindo do resultado
        if(ehDiagonal){
            System.out.println("A matriz é diagonal");
        } else {
            System.out.println("A matriz não é diagonal");
        }
        scan.close();


    }



}
