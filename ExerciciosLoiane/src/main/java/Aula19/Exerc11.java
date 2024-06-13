package Aula19;
import java.util.Scanner;
/*
Criar um vetor A com 10 elementos inteiros.
Imprimentar um progrma que defina e escreva a quantidade de elementos armazenados neste vetor que são pares
 */

public class Exerc11 {
   public static void main(String[]args){
       Scanner scan = new Scanner(System.in);
       int[] A = {10, 40, 50, 47, 29, 9, 7, 8, 7, 9};
       int contPares = 0;

       /*for (int i = 0; i < A.length; i++){
           A[i] = scan.nextInt();
       } */

       for(int i = 0; i < A.length; i++){
           if(A[i] % 2 == 0){
               contPares++;
               System.out.println("Numero par: " + A[i] + " ");
           }
       }

       System.out.println("\nQuantidade de pares: " + contPares);
   }
}
