package livro100Exercicios.matematica;
import java.util.Scanner;
/*
escreva um programa que calcule a velocidade média de um objeto, utilizando
a fórumola V = Δs / Δt, onde v é a velocidade média, Δs é a variação de espaço e Δt é a variação de tempo
 */

public class Exerc11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a variação de estaço(Δs):  ");
        Double variacaoEspaco = scan.nextDouble();

        System.out.println("Digite a variação de tempo(Δt): ");
        Double variacaoTempo = scan.nextDouble();

        double velocidadeMedia = variacaoEspaco / variacaoTempo;

        System.out.println("A media da velocidade é: " + velocidadeMedia);


    }
}
