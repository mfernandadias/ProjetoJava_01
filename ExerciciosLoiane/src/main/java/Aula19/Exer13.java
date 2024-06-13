package Aula19;
import java.util.Scanner;
/*
Criar um vetor A cm 10 elementos interios. Implementar um programa que dertermine a soma
dos elementos armazenados neste vetor que são múltiplos de 5
 */

public class Exer13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int soma = 0;

        int[] A = {10, 50, 70, 8, 9, 5, 4, 70, 80, 6};

        for(int i = 0; i < A.length; i++){
            if (A[i] % 5 == 0 ){
                soma += A[i];
            }
        }

        System.out.println("A soma dos elementos múltiplos por 5 é: " + soma);

    }
}
