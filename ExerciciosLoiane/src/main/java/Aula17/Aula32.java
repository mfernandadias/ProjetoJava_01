package Aula17;
import java.util.Scanner;
/*
Faca um programa que calcule o fatorial de um numero inteiro
fornecido pelo usuério. Ex.: 5!=5.4.3.2.1=120. A saida deve ser
conforme 0 exemplo abaixo

0 Fatorial de: 5

© 51=5.4.3.2.1=120
 */

public class Aula32 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor");
        int num = scan.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= num; i++){
            fatorial *= 1;
        }
        //exibir o resultado
        System.out.println(num + "! = " + fatorial );
    }
}
