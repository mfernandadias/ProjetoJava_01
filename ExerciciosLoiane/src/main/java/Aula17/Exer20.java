package Aula17;
import java.util.Scanner;
/*
Altere o programa de célculo do fatorial, permitindo ao usuario calcular
o fatorial varias vezes e limitando o fatorial a nimeros inteiros positivos
e menores que 16.
 */

public class Exer20 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numero;

        do {
            System.out.print("\nInforme um número inteiro positivo menor que 16 para calcular o fatorial (ou 0 para sair): ");
            numero = scan.nextInt();

            if (numero >= 0 && numero < 16) {
                int fatorial = 1;
                for (int i = 1; i <= numero; i++) {
                    fatorial *= i;
                }
                System.out.println("O fatorial de " + numero + " é: " + fatorial);
            } else if (numero != 0) {
                System.out.println("Número inválido. Tente novamente.");
            }
        } while (numero != 0);

        System.out.println("\nPrograma finalizado.");
        scan.close();
    }
}
