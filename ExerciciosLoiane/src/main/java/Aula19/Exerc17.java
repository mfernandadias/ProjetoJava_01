package Aula19;
import java.util.Scanner;
/*
ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. escreva um programa que determine
e escreva a quantidade de pessoas que podduem idade superior a 35 anos.
 */

public class Exerc17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] A = {10, 20, 39, 2, 3, 40, 39, 10, 10, 80};
        int idadeMenor = 0;
        int idadeMaior = 0;

        for(int i = 0; i < A.length; i++){
            if (A[i] < 35 ){
                idadeMenor++;
            } else {
                idadeMaior++;
            }
        }

        System.out.println("Quantidade de pessoas que tem idade menor que 35 é: " + idadeMenor + " ");
        System.out.println("Quantidade de pessoa sque tem idade mmeior que 35 é: " + idadeMaior + " ");


    }
}
