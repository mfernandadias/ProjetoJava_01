package livro100Exercicios.vetores;
import java.util.Scanner;

public class Exer80 {
    public static void main(String[] args){
        /*
        Crie um programa que leia um vetor de números inteiros e verifique s todos os
        elementos são pares
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho que deseja pra o seu vetor ");
        int tamanho = scan.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do seu vetor");
        for(int i = 0; i < tamanho; i++){
            vetor[i] = scan.nextInt();
        }

        boolean todosPares = true;
        for(int i = 0; i < tamanho; i++){
            if(vetor[i] % 2 != 0){
                todosPares  = false;
                break;
            }
        }

        if(todosPares){
            System.out.println("Todos os elementos são pares.");
        } else {
            System.out.println("Existem elementos ímpares no vetor");
        }

    }
}
