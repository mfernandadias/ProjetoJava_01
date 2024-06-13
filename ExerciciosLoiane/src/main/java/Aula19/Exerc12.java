package Aula19;
import java.util.Scanner;
/*
Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a soma
de todos os elementos armazenados neste vetor;
 */

public class Exerc12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int soma = 0;

        System.out.println("Digite 10 valores para o vetor A: ");
        for (int i = 0; i < A.length; i++){
            A[i] = scan.nextInt();
        }

        for(int i = 0; i < A.length; i++){
            soma += A[i];
        }

        System.out.println("A soma do vetor é: " + soma);

    }
}
