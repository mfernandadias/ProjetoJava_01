package Aula17;
import java.util.Scanner;
/*
faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário
 */

public class Aula19 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro ");
        int num = scan.nextInt();

        int multiplicacao = 1;

        System.out.println(num +"! =");
        for (int i = num; i >= 1; i--){
            multiplicacao = multiplicacao * i;
        }
        System.out.println(multiplicacao);

    }
}
