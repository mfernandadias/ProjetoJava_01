package livro100Exercicios.vetores;
import java.util.Scanner;

public class Exer71 {
    /*
    crie um prograa que leia um vetor de números inteiros exiba a soma de todos os elementos
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int n = scan.nextInt();

        int[] vetor = new int[n];

        System.out.println("Digite os elementos do vetor: ");
        for(int i = 0; i < n; i++){
            vetor[i] = scan.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < n; i++){
            soma += vetor[i];
        }

        System.out.println("A soma dos elementos é: " + soma);

        scan.close();

    }
}
