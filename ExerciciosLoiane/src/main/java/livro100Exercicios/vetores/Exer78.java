package livro100Exercicios.vetores;
import java.util.Scanner;

public class Exer78 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        /* crie um programa que leia um vetor de números inteiros e
        exiba quantas vezes um número específico aparece no vetor
         */

        System.out.println("Digite o tamanho do cetor que você deseja: ");
        int tamanho = scan.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor");
        for(int i = 0; i < tamanho; i++){
            vetor[i] = scan.nextInt();
        }

        System.out.println("Digite o número a ser buscado");
        int numBuscando = scan.nextInt();

         int contagem = 0;

         for(int i = 0; i < tamanho; i++){
             if(vetor[i] == numBuscando) {
                 contagem++;
             }
         }
         System.out.println("O número " + numBuscando + " aparece " + contagem + "vezes");

    }
}
