package livro100Exercicios.matematica;
import java.util.Scanner;

public class exerc02 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        /*
        escreva um programa que calcule a média aritmédica de dois números
         */

        System.out.println("Digite o primeiro valor");
        double num1 = scan.nextDouble();

        System.out.println("Digite o segundo valor");
        double num2 = scan.nextDouble();

        double media = (num1 + num2) / 2;

        System.out.println("A média aritmédica é: " + media);

    }
}
