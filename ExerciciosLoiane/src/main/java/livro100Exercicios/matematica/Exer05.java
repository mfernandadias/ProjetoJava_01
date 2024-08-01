package livro100Exercicios.matematica;
import java.util.Scanner;
/*
escreva um programa que calcule a IMC de um individuo, utilizadno a fórmula IMC = peso / altura²
 */

public class Exer05 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu peso");
        double peso = scan.nextDouble();

        System.out.println("Digite sua altura");
        double altura = scan.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("O IMC é: " + imc);

        scan.close();

    }
}
