package livro100Exercicios.vetores;
import java.util.Scanner;
public class Exer79 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        /*
        escreva um programa que leia dois vetores de números inteiros com o mesmo tamanho e exiba um novo
        vetor com os elementos resultantes da multiplicação dos elementos correspondentes dos dois vetores
         */
        System.out.println("Digite o tamanho do vetor ");
        int tamanho = scan.nextInt();

        int[] vetor1  = new int[tamanho];
        int[] vetor2 = new int[tamanho];
        int[] vetorResultado = new int[tamanho];

        System.out.println("Digite os elementos do primeiro vetor");
        for(int i = 0; i < tamanho; i++){
            vetor1[i] = scan.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor");
        for(int i = 0; i < tamanho; i++){
            vetor2[i] = scan.nextInt();
        }

        for(int i = 0; i < tamanho; i++){
            vetorResultado[i] = vetor1[i] * vetor2[i];
        }

        System.out.println("Resultado do vetor de multiplicação");
        for(int i = 0; i < tamanho; i++){
            System.out.println("Posição" + (i + 1) + ":");
        }

        scan.close();
    }
}
