package livro100Exercicios.Condicionais;
import java.util.Scanner;

public class Exer29 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        /*
        faça um programa que leia um número e informe se ele é par ou impar
         */
        System.out.println("Digite um valor");
        double valor = scan.nextDouble();

        if(valor % 2 == 0){
            System.out.println("O número digitado é par");
        } else {
            System.out.println("O valor digitado é impar ");
        }
    }
}
