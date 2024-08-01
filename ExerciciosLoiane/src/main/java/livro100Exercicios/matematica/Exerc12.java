package livro100Exercicios.matematica;
import java.util.Scanner;
/*
escreva um programa que calcule a energia cinética de um objeto em movimento, utilizando a fórmmula E= (mv²)/2,
onde E é a energia cinética, m é a massa do objeto e v é velocidade
 */

public class Exerc12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("DIgite a massa do objeto: ");
        double massa = scan.nextDouble();

        System.out.println("Digite a velocidade do objeto: ");
        double velocidade = scan.nextDouble();

        double energiaCinematica = (massa * Math.pow(velocidade, 2) / 2);

        System.out.println("A energia Cinematica é: " + energiaCinematica);


    }
}
