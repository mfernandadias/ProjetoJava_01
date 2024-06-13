package Aula19;
import java.util.Scanner;
/*
criar um vetor A com 10 elementos interios. Desenvolver um programa que defina
 o percentual de elementos pares e impares, respectivamente, armazenado neste vetor,
 */

public class Exerc15 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int[] A = {10, 47, 8, 3, 2,6,78, 8, 9, 0,};
        int numPar = 0;
        int numImp = 0;
        float porNumPar;
        float porNumImp;

        for (int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0){
                numPar++;
                //porNumPar = numPar++ * 100;
            } else {
                numImp++;
                //porNumImp = numImp * 100;
            }
        }

        //calculando o perentual de números pares e impares
        porNumPar = (numPar * 100.0f) / A.length;
        porNumImp = (numImp * 100.0f) / A.length;

        System.out.println("A porcentagem de número Par é: " + porNumPar + "% ");
        System.out.println("A porcentagem de número Impar é: " + porNumImp + "% ");
   }
}
