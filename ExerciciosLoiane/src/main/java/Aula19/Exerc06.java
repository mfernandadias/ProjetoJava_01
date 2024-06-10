package Aula19;
import java.util.Scanner;
/*
criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada
elemento de C é a soma dos respectivos elementos em A e B, ou seja:
C[i] = A[i] + B[i] 
 */

public class Exerc06 {
    public static void main(String[]args){
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        //obejto Scanner para leitura da entrada do usuário
        Scanner scan = new Scanner (System.in);

        //Populando os vetores A e B com valores digitados pelo usuário
        System.out.println("digite os valores para vetor A: ");
        for (int i = 0; i <A.length; i++){
            System.out.println("A [" + (i + 1) + "]:");
            A[i] = scan.nextInt();
        }

        System.out.println("Digite os valores para o Vetor B: ");
        for (int i = 0; i < B.length; i++){
            System.out.print("B [" + (i + 1) + " ]:");
            B[i]= scan.nextInt();
        }

        //calculando a soma dos elementos de A e B e armazenando em C
        for (int  i = 0; i < C.length; i++){
            C[i] = A[i] + B[i];
        }

        //imprimindo os vetores A, B e C
        System.out.print("\nVetor A: ");
        for (int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }

        System.out.print("\nVetor B: ");
        for (int i = 0; i < B.length; i++){
            System.out.print(B[i] + " ");
        }

        System.out.print("\nVetor C: ");
        for (int i = 0; i <C.length; i++){
            System.out.print(C[i] + " ");
        }
    }
}

