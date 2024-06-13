package Aula19;
import java.util.Scanner;
/*
criar dois vetores A e B cada um com 10 elementos interios. Contruir um vetor c, onde cada elemento de C
é a divisão dos respectivos elemntos de A e B, ou seja:
C[i] = A[i] / float(B[i];

 */


public class Exer09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] A = new int[10];
        float[] B = new float[10];
        float[] C = new float[10];

        System.out.println("Digite 10 valores para o vetor A");
        for (int i = 0; i < A.length; i++) {
            System.out.print("A [" + (i + 1) + "]: ");
            A[i] = scan.nextInt();
        }

        System.out.println("Digite 10 valores para o vetor B");
        for (int i = 0; i < B.length; i++){
            System.out.println("B [" + (i + 1) + "]");
            B[i] = scan.nextInt();
        }
        
        for (int i = 0; i < C.length; i++){
            C[i] = A[i] / (B[i]);
        }

        //print is vactors vectors
        System.out.print("\nVetor A: ");
        for (int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }

        System.out.println("\nVetor B: ");
        for(int i = 0; i < B.length; i++){
            System.out.print(B[i] + " ");
        }

        System.out.println("\nVetor C:");
        for (int i = 0; i<B.length; i++){
            System.out.print(C[i] + " ");
        }
    }
}
