package Aula17;
import java.util.Scanner;
/*
o snúmero sprimo possuem várias aplicações dentro da computação, por exemplo na Criptografia.
Um número primo é aquele que é divisível apenas por um e por ele mesmo, Faça um número que peça
um número inteiro e determine se ele é ou não um número primo
 */

public class Exer34 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor inteiro");
        int num = scan.nextInt();

        if(num <= 1){
            System.out.println("O valor digitado não é primo ");
        } else {
            boolean primo = true;
            for (int i = 2; i <= num /2; i++){
                if (num % i == 0){
                    primo = false;
                    break;
                }
            }
            if (primo){
                System.out.println("è um número primo");
            } else {
                System.out.println("Não é um número primo");
            }
        }
    }
}
