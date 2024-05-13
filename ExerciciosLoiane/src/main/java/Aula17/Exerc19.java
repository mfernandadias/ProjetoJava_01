package Aula17;
import java.util.Scanner;

/*
Altere o programa de cálculo do fatorial, permitindo ao usário calcular o fatorial várias
vezes e limitando o fatorial a números inteiros positivos e menores que 16
 */

public class Exerc19 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // Variáveis para armazenar estatísticas
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;

        int quantidade = 0;
        while (quantidade <= 0 || quantidade > 1000){
            System.out.println("INforme a quantidade de números (entre 0 a 1000): ");
            quantidade = scan.nextInt();

            if (quantidade <= 0 || quantidade > 100){
                System.out.println("Valor inválido. Tente novamente.");
            }
        }
        // Loop para processar cada número
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scan.nextInt();

            // Validar o número
            while (numero < 0 || numero > 1000) {
                System.out.println("Valor inválido. Digite um número entre 0 e 1000: ");
                numero = scan.nextInt();
            }

            // Atualizar menor valor
            menor = Math.min(menor, numero);

            // Atualizar maior valor
            maior = Math.max(maior, numero);

            // Somar o número
            soma += numero;
        }

        // Exibir os resultados
        System.out.println("\nO menor valor é: " + menor);
        System.out.println("O maior valor é: " + maior);
        System.out.println("A soma dos valores é: " + soma);

        scan.close();



    }
}
