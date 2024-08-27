package livro100Exercicios.matrizes;
import java.util.Scanner;

public class Exer88 {
    /*
    faça um programa que leia dua smatrizes e dê como resposta a multiplicação entre eles.
    O programa entre elas. O programa deverá observar se é possível ou não realiza a multiplicação entre as
    duas matrizes
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de linhas da primeira matriz");
        int linhasA = scan.nextInt();

        System.out.println("Digite o número das colunas da primeira matriz");
        int colunasA = scan.nextInt();

        System.out.println("Digite o número das linhas da segunda matriz");
        int linhasB = scan.nextInt();

        System.out.println("Digite o número das colunas da segunda matriz ");
        int colunasB = scan.nextInt();

        //verica se pode ocorrr a multiplicação
        if (colunasA != linhasB) {

            System.out.println("Nâo é possível multiplicar as matrizes");
            System.out.println(0);
        }

        //cria as matrizes
        int[][] matrizA = new int[linhasA][colunasB];
        int[][] matrizB = new int[linhasB][colunasB];
        int[][] matrizResultado = new int[linhasA][colunasB];

        //lè os elementos da primeira matriz
        System.out.println("Digite os elementos da primeira matriz:");
        for(int i = 0; i < linhasA; i++){
            for(int j = 0; j < colunasA; j++){
                matrizA[i][j]= scan.nextInt();
            }
        }

        //lè os elementos da segunda matriz
        System.out.println("Digite os elementos da primeira matriz:");
        for(int i = 0; i < linhasB; i++){
            for(int j = 0; j < colunasB; j++){
                matrizA[i][j]= scan.nextInt();
            }
        }

        //realiza a multiplicação dasmatrizes
        System.out.println("digite os elementos da segunda matriz: ");
        for(int i = 0; i < linhasA; i++){
            for(int j = 0; j < colunasB; i++){
                for(int k = 0; k < colunasA; k++){
                    matrizResultado[i][j] += matrizA[i][k] * matrizB[i][k];
                }
            }
        }

        //exibe a matriz resultado
        System.out.println("Matriz Resultado");
        for(int i = 0; i < linhasA; i++){
            for(int j = 0; i < linhasA; i++){
            System.out.println(matrizResultado[i][j] + " ");
            }
            System.out.println();
        }
        scan.close();

    }
}
