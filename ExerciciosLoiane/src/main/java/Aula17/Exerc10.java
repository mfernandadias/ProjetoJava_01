package Aula17;
import java.util.Scanner;
/*
Faca um programa que receba dois nimeros inteiros e gere os
numeros inteiros que estado no intervalo compreendido por eles.
 */

public class Exerc10 {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);

       System.out.println("Digite seu primeiro valor: ");
       int num1 = scan.nextInt();

       System.out.println("Digite o segundo valor: ");
       int num2 = scan.nextInt();

       int menor = Math.min(num1, num2);
       int maior = Math.max(num1, num2);

       System.out.println("Número no intervalo: ");
       for ( int numero = menor; numero <= maior; numero++ ){
           System.out.println(numero + " ");
        }
       scan.close();

    }
}
