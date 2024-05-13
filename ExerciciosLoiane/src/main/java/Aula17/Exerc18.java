package Aula17;
import java.util.Scanner;
/*
Faga um programa que, dado um conjunto de N numeros, determine o
menor valor, 0 maior valor e a soma dos valores.

 */

public class Exerc18 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //variáveis para armazenar estatísticas
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;

        //obter a quantidade de números
        System.out.println("Informe a quantidade de números: ");
        int quantidade = scan.nextInt();

        //loop para processar cada números
        for (int i = 1; i <= quantidade; i++){
            System.out.println("Digite o número " + i + ": ");
            int numero = scan.nextInt();

            //atualizar menor valor
            menor = Math.min(menor, numero);

            //atualizar maior valor
            maior = Math.max(maior, numero);

            //Somar o número
            soma += numero;
        }

        System.out.println("\n O menor valor é " + menor);
        System.out.println("\n O maior valor é: " + maior);
        System.out.println("A soma dos valores é: " + soma);

        scan.close();
        
    }
}
