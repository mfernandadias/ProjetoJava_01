package livro100Exercicios.Condicionais;
import java.util.Scanner;

public class Exer30 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /*
        faça um programa que leia um número e informe se ele é positivo, negativo ou zero
         */
        System.out.println("Digite um valor");
        double valor = scan.nextDouble();

        if(valor > 0){
            System.out.println("O valor digitado é positivo");
        } else if(valor < 0 ){
            System.out.println("O valor digitado é negativo");
        } else {
            System.out.println("O valor digitado é igual a zero");

        }
    }
}
