package Aula19;
import java.util.Scanner;
import java.util.Arrays;
/*
Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
0 e 1, sugestdo: A[i] = (int)Math.round(Math.random() * 1); Pede-se
para implementar um programa que determine o percentual de
numeros 0's e 1's existentes no vetor A.
1 - gerar o vetor de 10 elementos com velores de 0 e 1
2 - contar a quantidade de 0's e 1's no vetor
3 - calcular o percentual de 0's e 1's
4 - xibir os percentuais
 */

public class Exer22 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] A = new int[10];

        // Gerar o vetor A com 10 elementos aleatórios entre 0 e 1
        for (int i = 0; i < A.length; i++) {
            A[i] = (int)Math.round(Math.random() * 1);
        }

        // Contar a quantidade de 0's e 1's
        int countZero = 0;
        int countOne = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                countZero++;
            } else {
                countOne++;
            }
        }

        // Calcular o percentual de 0's e 1's
        double percentZero = (countZero * 100.0) / A.length;
        double percentOne = (countOne * 100.0) / A.length;

        // Exibir os percentuais
        System.out.println("Vetor A: " + Arrays.toString(A));
        System.out.println("Percentual de 0's: " + percentZero + "%");
        System.out.println("Percentual de 1's: " + percentOne + "%");
    }
}
