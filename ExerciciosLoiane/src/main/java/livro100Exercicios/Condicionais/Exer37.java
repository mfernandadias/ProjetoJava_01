package livro100Exercicios.Condicionais;
import java.util.Scanner;

public class Exer37 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        /*
        faça um programa que leia três números e informe se els podem ser os lados de um triângulo (a soma
        de dois lados deve ser sempre maior  que o terceiro lado)
         */

        System.out.println("Você irá digitar três o valor de três lados");
        System.out.println("Digite o primeira lado");
        double lado1 = scan.nextDouble();

        System.out.println("Digite o segundo lado");
        double lado2 = scan.nextDouble();

        System.out.println("Digite o terceiro lado");
        double lado3 = scan.nextDouble();

    }
}
