package livro100Exercicios.matematica;
import java.util.Scanner;
/*
escreva um programa que calcule o perímetro e a área de um retângulo, utilizando as fórmulas P = 2(l + c) e
A = lc, onde l é a largula e c é o comprimento
 */

public class Exer09 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a largura do retângula: ");
        double largura = scan.nextDouble();

        System.out.println("Digite o comprimento em retângulo: ");
        double comprimento = scan.nextDouble();

        double area = largura * comprimento;
        double perimetro = 2 * (largura + comprimento);

        System.out.println("A área do retângulo é: " + area);
        System.out.println("A perímetro do retângulo é: " + perimetro);

    }
}
