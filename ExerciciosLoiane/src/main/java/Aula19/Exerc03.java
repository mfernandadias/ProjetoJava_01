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
        int[] B = new int[A.length];

        System.out.println("Digite 15 elementos para inserir no vetor");
        for (int i =0; i < A.length; i++){
            System.out.println("Elemento " + (i + 1) + " : ");
            A[i] = scan.nextInt();
        }

        System.out.println("Digite 15 elemento para inserir no vetor");
        for (int i = 0; i < A.length; i++){
            System.out.println("Elemento " + (i + 1) + " : ");
            A[i] = scan.nextInt();
        }


    }
}
