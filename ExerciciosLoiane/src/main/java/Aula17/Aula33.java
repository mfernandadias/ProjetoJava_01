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

       System.out.println("Digite umm valor");
       int num = scan.nextInt();

       if(num <= 1){
           System.out.println("O valor digitado não é primo");
       } else {
           boolean primo = true;
           for (int i =2; i <= num /2; i++){
               if (num % i == 0){
                   primo = false;
                   break;
               }
           }
           if (primo){
               System.out.println("é um número primo");
           } else {
               System.out.println("Não é um número primo");
           }
       }
       scan.close();


    }
}
