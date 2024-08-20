package livro100Exercicios.vetores;
import java.util.Scanner;

public class Exer74 {
    public static void main(String[] args){
        /*
        crie um programa que leia dois vetores de números inteiros com o mesmo tamanho e exiba um novo vetor com a soma
        dos elementos correspondentes dos dois vetores
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho dos vetores:" );
        int tamanho = scan.nextInt();


        int[] vetor1 = new int[tamanho];
        int[] vetor2 = new int[tamanho];
        int[] vetorSoma = new int[tamanho];

        System.out.println("Digite os elementos do primeiro vetor: ");
        for(int i = 0; i < tamanho; i++){
            vetor1[i] = scan.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor: ");
        for( int i = 0; i < tamanho; i++){
            vetor2[i] = scan.nextInt();
        }

        for(int i = 0; i < tamanho; i++){
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }

        System.out.println("A soma dos elementos correspondetes dos vetores é: ");
        for(int i = 0; i < tamanho; i++){
            System.out.println(vetorSoma[i] + " ");
        }
        scan.close();

    }
}
