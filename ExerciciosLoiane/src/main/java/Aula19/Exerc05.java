package Aula19;
import java.util.Scanner;
/*
criar um vetor A com 10 elementos interios. contruir um vetor B de mesmo tipo e tamanho, sendo cada elemento
do vetor B deverá ser o respectivo elemento de A multiplicado por sua posição (ou índice), ou seja:
B[i] = A[i] * i
 */

public class Exerc05 {
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);

        int[] A = new int[10];
        int[] B = new int[10];

        System.out.println("Digite 10 valores para o vetor A");
        for (int i = 0; i<A.length; i++){
            System.out.print("Elemento " + (i + 1) + " : ");
            A[i] = scan.nextInt();
        }

        System.out.println("O valor do vetor B é: ");
        for (int i = 0; i < B.length; i++){
            B[i] = A[i] * i;
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
