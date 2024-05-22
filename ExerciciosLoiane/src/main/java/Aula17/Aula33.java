package Aula17;
import java.util.Scanner;
/*
Os numeros primos possuem varias aplicacoes dentro da :
Computagdo, por exemplo na Criptografia. Um numero primo é aquele
que é divisivel apenas por um e por ele mesmo. Faga um programa
que pega um numero inteiro e determine se ele € ou n&o um namero
primo.
 */

public class Aula33 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor inteiro");
        int num = scan.nextInt();

        if (num <=1){
            System.out.println(num + "Não é um número primo");
        }else {
            boolean ehPrimo = true;

            for (int i =2; i <= num / 2; i++){
                if (num % 1 == 0){
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo){
                System.out.println(num + " é um numero primo");
            }else {
                System.out.println(num + "não é um número primo");
            }
        }



    }
}
