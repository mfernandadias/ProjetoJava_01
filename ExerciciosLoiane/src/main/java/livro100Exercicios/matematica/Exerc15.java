package livro100Exercicios.matematica;
import java.util.Scanner;
/*
crie um programa que solicite ao usuário o valor do raio de uma esfera e calcule e exiba o seu volante
 */

public class Exerc15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do raio da esfera: ");
        double raio = scan.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

        System.out.println("O volume da efera é: " + volume);

        scan.close();

    }


}
