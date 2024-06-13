package Aula19;
import java.util.Scanner;
/*
criatr um vetor A de 10 elementos inteiros. Implementar um programa que defina e
escreva a média aritmédica simples dos elementos ímpares armazenadas neste vetor
 */

public class Exerc14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] A = {10, 80, 7, 5, 6, 1, 8, 9, 11, 13};
        int valor = 0;
        int quant = 0;
        float media = 0;


        for (int i = 0; i < A.length; i++){
            if  (A[i] % 2 != 0){
                quant++;
                valor += A[i];
            }
        }
        media = valor / quant;
        System.out.println("A média é " + media);
    }
}
