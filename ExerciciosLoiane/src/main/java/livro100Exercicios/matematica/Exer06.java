package livro100Exercicios.matematica;
import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args){
        /*
        crie um programa que calcule e exiba o períometro de um círculo, solciitando o raio ao usuário
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
        double raio = scan.nextDouble();

        double perimetro = 2 * Math.PI * raio;

        System.out.println("O perímetro do círculo é: " + perimetro);

        scan.close();

    }
}
