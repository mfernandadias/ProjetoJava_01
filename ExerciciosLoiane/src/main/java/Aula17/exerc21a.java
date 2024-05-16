package Aula17;
import java.util.Scanner;
/*
faça um programa que peça um número inteiro e determine se ele é ou não um número primo. Um número primo
é aquele que é divisével somente por ele mesmo e por 1
numero primo: divisivel por 1 e por ele mesmo (somente)
numeo de divisores é 2

 */

public class exerc21a {
    public static void main(String[]args){
        Scanner scan =  new Scanner(System.in);

        int numdivisores = 0;

        System.out.println("Digite um valor inteiro");
        int numPrimo = scan.nextInt();

        for ( int i = 1; i <= numPrimo; i++){
            if (numPrimo % 1 == 0){
                numdivisores++;
            }
        }
        if (numdivisores ==  2){
            System.out.println("O número digitado é primo: ");
        } else {
            System.out.println("O número digitado é primo: ");
        }

    }
}
