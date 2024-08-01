package livro100Exercicios.matematica;
import java.util.Scanner;
/*
escreva um programa que calcule o IMC um indivídual, utilizando a fórmula IMC =
 */

public class Exerc04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        double num1 = scan.nextDouble();

        System.out.println("Digite o segundo valor");
        double num2 = scan.nextDouble();

        System.out.println("Digite o terceiro valor");
        double num3 = scan.nextDouble();

         double mediaGeometrica = Math.pow(num1 * num2 * num3, 1.0/3.0);

         System.out.println("A media geometrrica dos números é: " + mediaGeometrica);

         scan.close();

    }
}
