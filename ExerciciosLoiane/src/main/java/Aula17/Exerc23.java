package Aula17;
import java.util.Scanner;
/*
Faca um programa que mostre todos os primos entre 1 e N sendo N
um namero inteiro fornecido pelo usuério. O programa devera mostrar
também o numero de divisdes que ele executou para encontrar os
niimeros primos. Serao avaliados o funcionamento, o estilo e o numero
de testes (divisdes) executados.
 */

public class Exerc23 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro N: ");
        int N = scan.nextInt();

        int totalDivisores = 0;

        for (int num =2; num <= N; num++){
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++){
                totalDivisores++;
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(num);
            }
        }
        System.out.println("Número total de divisões executadas: " + totalDivisores);

        scan.close();
    }
}
