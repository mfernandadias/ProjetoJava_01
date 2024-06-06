package Aula19;
import java.util.Scanner;
/*
criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo e tamannho,
sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento A, ou seja:
B[i] = A[i] * A[i]
 */

public class Exerc03 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        int[] A = new int[15];
        int[] B = new int[15];

        System.out.println("Digite 15 elementos para inserir no vetor");
        for (int i =0; i < A.length; i++){
            System.out.print("Elemento " + (i + 1) + " : ");
            A[i] = scan.nextInt();
        }

        for (int i = 0; i<A.length; i++){
            B[i] = A[i] + A[i];
        }

        //print elements of both vectors
        System.out.print("\nElementos do vetor A: ");
        for (int elemento : A){
            System.out.print(elemento + " ");
        }

        //
        System.out.print("\nElementos do vetor B: ");
        for (int elemento : B){
            System.out.print(elemento +  " ");
        }



    }
}
