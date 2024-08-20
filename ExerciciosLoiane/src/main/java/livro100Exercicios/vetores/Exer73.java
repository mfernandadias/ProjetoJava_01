package livro100Exercicios.vetores;
import java.util.Scanner;

public class Exer73 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade que você quer pro vetor: ");
        int quantidade = scan.nextInt();

        int[] vetor = new int[quantidade];

        System.out.println("Digite os elementos do vetor: ");
        for(int i = 0; i < quantidade; i++){
            vetor[i] = scan.nextInt();
        }

        int soma = 0;

        for(int i = 0; i < quantidade; i++){
            soma += vetor[i];
        }

        double media = soma / quantidade;

        System.out.println("A média é do vetor: " + media);

    }
}
