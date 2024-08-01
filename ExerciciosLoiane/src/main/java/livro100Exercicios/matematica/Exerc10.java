package livro100Exercicios.matematica;
import java.util.Scanner;
public class Exerc10 {
    /*
    escreva um programa que calcule o perímetro e a área de um triângulo, utilizando as
    fórmulas P = a + b + c e A = (b * h) / 2, onde a, b e c são os lados do triângulo e k é a altura ao lado b
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do lado A: ");
        double ladoA = scan.nextDouble();

        System.out.println("Digite o valor do lado B: ");
        double ladoB = scan.nextDouble();

        System.out.println("Digite o valor do lado C: ");
        double ladoC = scan.nextDouble();

        System.out.println("Digite a altura h relativa ao lado B do triângulo: ");
        double altura = scan.nextDouble();

        double area = (ladoB * altura) / 2;
        double perimetro = ladoA + ladoB + ladoC;

        System.out.println("O área do triangulo é: " + area);
        System.out.println("O perimetro do triangulo é: " + perimetro);
        scan.close();

    }
}
