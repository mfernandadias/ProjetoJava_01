package Aula19;
import java.util.Scanner;
/*
criar um vetor A com 8 elementos interios. Construir um vetor B de mesmo tipo e tamanho
e com os elementos do vetor A multiplicados por 2, ou seja: B[i] = A[i] * 2
 */

public class exer02 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];

        System.out.println("Digite 5 elementos para inserir no vetor");
        for (int i = 0; i < A.length; i++){
            System.out.println("Elemento " + (i + 1) + " : ");
            A[i] = scan.nextInt();
        }

        //copy elements from A to B
        for (int i = 0; i<A.length; i++){
            B[i] = A[i];
        }

        //print elements of both vectors
        System.out.println("\nElementos do vetor A: ");
        for (int elemento : A){
            System.out.println(elemento + " ");
        }

        //
        System.out.println("\nElementos do vetor B: ");
        for (int elemento : B){
            System.out.println(elemento + " ");
        }


    }
}
