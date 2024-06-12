package Aula19;
import java.util.Scanner;

/*
Criar dois vetores A e B cada um com 10 lemtnos inteiros.
Construir um vetor C, onde cada de C é a multiplicação dos respectivos elemtnos em A e B, ou seja
C[i] = A[i] * B[i]
 */


public class Exerc07 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        System.out.println("digite os valores para vetor A: ");
        for (int i = 0; i <A.length; i++){
            System.out.print("A  [" + (i+ 1) + "]:");
            A[i] = scan.nextInt();
        }

        System.out.println("Digite os valores para o vetor B:");
        for (int i = 0; i < B.length; i++){
            System.out.print("B [" + (i + 1) + "]:");
            B[i] = scan.nextInt();
        }

        for (int i = 0; i < C.length; i++){
            //System.out.println("C [" + (i + 2) + "]: ");
            C[i] = A[i] * B[i];
            //C[i] = scan.nextInt();
        }

        //imprimindo os vetores A, B e C
        System.out.print("\nVetor A: ");
        for (int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }

        System.out.print("\nVetor B: ");
        for (int i = 0; i<B.length; i++){
            System.out.print(B[i] + " ");
        }

        System.out.print("\nVetor C: ");
        for (int i = 0; i <C.length; i++){
            System.out.print(C[i] + " ");
        }
    }
}
