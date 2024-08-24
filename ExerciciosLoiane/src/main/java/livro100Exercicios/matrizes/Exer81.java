package livro100Exercicios.matrizes;
import java.util.Scanner;

public class Exer81 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /*
        faça um programa que preencha uma matriz 3x3 com valores informado pelo usuário
        e exiba a soma dos valores da diagonal principal
        */

        int [][] matriz = new int[3][3];

        System.out.println("Digite os valores da matriz 3x3");

        //preenchendo a matriz com valores informador pelo usuário
          for(int i = 0; i< matriz.length; i++){
              for(int j = 0; j < matriz.length; i++){
                  System.out.println("Digite o valor para a posição [" + i + "][" + j + "] + ]:");
              }
          }

          //calculando a soma dos valores da diagonal principal
        int somaDiagonal = 0;
          for(int i = 0; i <3; i++){
              somaDiagonal += matriz[i][i];
          }
          System.out.println("A soma dos valores da diagonal principal é: " + somaDiagonal);

          scan.close();
    }
}
