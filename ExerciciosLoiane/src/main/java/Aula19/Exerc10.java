package Aula19;

import java.util.Scanner;
/*
criar um vetor A com 10 elementos inteiros.
Construir um vetor B de mesmo tipo e taamanho, sendo que cada elemento do vetor B deverá ser o resultado
da divisão do respectivo elemento de A por 2(dois), ou seha B[i] = A[i] % 2;
 */

public class Exerc10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];

        System.out.println("Digite 10 elementos para inserir no vetor A");
        for (int i = 0; i < A.length; i++){
            System.out.print("A [" + (i + 1) + "]: ");
            A[i] = scan.nextInt();
        }

        for (int i = 0; i < B.length; i++){
            //System.out.print("B [" + (i + 1) + "]: ");
            B[i] = A[i] % 2;
        }

        //imprimir os vetores A e B
        System.out.println("\nVetor A: ");
        for (int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }

        System.out.println("\nVetor B: ");
        for (int i = 0; i < B.length; i++){
            System.out.print(B[i] + " ");
        }

    }
}
