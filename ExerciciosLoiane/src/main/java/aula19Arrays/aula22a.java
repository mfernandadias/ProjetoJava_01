package aula19Arrays;
import java.util.Scanner;
/*  gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a ) e 1, sugestão: A[i] = (int)Math.round(math.random()* 1);
pede-se para implementar um programa que determine o percentual de números 0's e 1's existente no vetor A
 */
import java.util.Random;

public class aula22a {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] A = new int[10];

        //gerar números aleatórios 0 ou 1 para o vetor A
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            A[i] = random.nextInt(2); //gera 0 ou 1
        }

        //contar quantos 0's e 1's existem no vator A
        int contZero = 0;
        int contUns = 0;

        for(int i = 0; i < 10; i++){
            if(A[i] == 0){
                contZero++;
            } else {
                contUns++;
            }
        }

        //calcular percentuais
        double percentualZeros = (double) contZero / 10 * 100;
        double percentuais = (double) contUns / 10 * 100;

        //exibir resultador
        System.out.println("Vetor A: ");
        for(int i = 0; i < 10; i++){
            System.out.println(A[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Percentual de 0's:" + percentualZeros + "%");
        System.out.println("Percentual de 1's: " + percentuais + "%");



    }

}
