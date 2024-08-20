package livro100Exercicios.vetores;
import java.util.Scanner;

public class Exer72 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        /*
        Faça um programa que leia um vetor de números inteiros e exiba o maior elemento presente no vetor
         */
        System.out.println("Digite a quantidade de elementos: ");
        int quantidade = scan.nextInt();

        int[] vetor = new int[quantidade];

        System.out.println("Digite os elementos do vetor: ");

        for(int i = 0; i < quantidade; i++){
            System.out.println("Elemento " + (i + 1) + ": ");
        }

        int maior = vetor[0];

        for(int i = 0; i < quantidade; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }

        System.out.println("O maior elemento do vetor é: " + maior);

        scan.close();


    }
}
