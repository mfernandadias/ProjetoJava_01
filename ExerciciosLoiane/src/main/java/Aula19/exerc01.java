package Aula19;
import java.util.Scanner;
/*
criar um vetor A com 5 elementos inteiros. Construis um vetor B de mesmo tipo e tamanho com
os "mesmos" elementos do vetor A, ou seja, B[i] = A[i]
 */

public class exerc01 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        //criar e inicializa o vetor A com 5 elementos interios
        int[] A = {10, 20, 30, 40, 50};

        int[] B = new int[A.length];

        for (int i = 0 ; i < A.length; i++ ){
            B[i] = A[i] ;
        }

        //demonstrando que os elementos de B são cópias de A
        System.out.println("Elementos do vetor A: ");
        for(int elemento : A){
            System.out.println(elemento + " ");
        }

        System.out.println("\nElemento do vetor B: ");
        for (int elemento : B){
            System.out.println(elemento + " ");
        }
    }
}
