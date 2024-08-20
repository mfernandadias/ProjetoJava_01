package livro100Exercicios.vetores;
import java.util.Scanner;

public class Exer76 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /*
        escreva um programa que leia um vetor de números
        inteiros e exiba os elementos na ordem inversa
         */

        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = scan.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor: ");
        for(int i = 0; i < tamanho; i++){
            vetor[i] = scan.nextInt();
        }

        System.out.println("Elementos do vetor em ordem inversa: ");
        for(int i = tamanho - 1; i >= 0; i--){
            System.out.println(vetor[i] + " ");
        }
        scan.close();
    }
}
