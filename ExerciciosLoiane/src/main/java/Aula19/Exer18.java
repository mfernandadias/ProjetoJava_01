package Aula19;
import java.util.Scanner;
/*
ler um vetor A com 10 elementos interios correspondentes as idades de um grupo de pessoas. Escreva
um programa que determine e escreva a menor e a maior idade e suas respectiva posições
 */

public class Exer18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];

        //ler as idades
        System.out.println("Digite as idades de 10 pessoas: ");
        for (int i = 0; i < A.length; i++) {
            System.out.println("Idade de pessoa  " + (i + 1) + ": ");
            A[i] = scan.nextInt();
        }

        int menorIdade = A[0];
        int maiorIdade = A[0];
        int posMenor = 0;
        int posMaior = 0;

        //determinar a menor e a maior idade e suas posições
        for (int i = 1; i < A.length; i++) {
            if (A[i] < menorIdade) {
                menorIdade = A[i];
                posMenor = i;
            }
            if (A[i] > maiorIdade) {
                maiorIdade = A[i];
                posMaior = i;
            }
            // Imprimir os resultados
            System.out.println("A menor idade é: " + menorIdade + " na posição " + posMenor);
            System.out.println("A maior idade é: " + maiorIdade + " na posição " + posMaior);
        }
    }
}