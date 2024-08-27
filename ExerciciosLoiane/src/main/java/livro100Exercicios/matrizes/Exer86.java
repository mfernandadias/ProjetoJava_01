package livro100Exercicios.matrizes;

import java.util.Random;

public class Exer86 {
    /*
    faça um programa que preencha uma matriz 4x4 comnúmeros aleatórios e exiba a soma dos valores presentes em cada linha
    e em cada coluna
     */
    public static void main(String[]args){

        int[] [] matriz = new int[4][4];
        Random random = new Random();

        //preencha a matriz com número aleatórios
        for(int i = 0; i < 4; i++){
            for(int j = 0; j<4; j++){
                matriz[i][j]= random.nextInt(100);
            }
        }

        //exibindo a matriz
        System.out.println("Matriz: ");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }

        //calculando a soma das linhas
        System.out.println("Soma das linhas");
        for(int i = 0; i<4;i++){
            int somaLinha = 0;
            for(int j = 0; j <4; j++){
                somaLinha += matriz[i][j];
            }
            System.out.println("Linha " + (i + 1) + ": " + somaLinha );
        }

        //calculando a soma das colunas
        System.out.println("Soma das coludas");
        for(int j = 0; j < 4; j++){
            int somaColuna = 0;
            for(int i = 0; i < 4; i++){
                somaColuna += matriz[i][j];
            }
            System.out.println("Soluna " + (j + 1) + ": " + somaColuna);

        }
    }
}
