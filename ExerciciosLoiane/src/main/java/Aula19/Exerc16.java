package Aula19;
import java.util.Scanner;
/*
criar um vetor A com 10 elementos inteiros. Escrever um prorgam que calcule e escreva:
a) soma de elementos armazenados neste vetor que são inferiores a 15;
b) a quantidade de elementos armazenados no vetor que são iguais a 15
c) a média dos armazenados no vetor que são superiores a 15
 */

public class Exerc16 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] A = {10, 1, 3, 5, 6, 18, 19, 15, 15, 19};
        int somaInf = 0;
        //int eleInf = 0;
        int eleIgual = 0;
        int somaSup = 0;
        int eleSup =  0;

        for (int i = 0; i < A.length; i++){
            if(A[i] < 15){
                somaInf += A[i];
            } else if (A[i] == 15){
              eleIgual++;
            } else {
                somaSup+= A[i];
                eleSup++;
            }
        }

        float mediaSup = somaSup / eleSup;

        System.out.println("A soma de elementos menores que 15 é: " + somaInf + " ");
        System.out.println("A quantidade de elementos armazenados no vetor que são éguai a 15 é: " + eleIgual + " ");
        System.out.println("A média dos armazenado no vetor que são superiores a 15 é: " + mediaSup + " ");


    }
}
