package livro100Exercicios.Condicionais;
import java.util.Scanner;

public class Exer33 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /*
        Faça um programa que leia três números, e informe se a soma detes é divisilvém por 5 ou não
         */
        System.out.println("Digite seu primeiro valor");
        double valor1 = scan.nextDouble();

        System.out.println("Digite seu segundo valor");
        double valor2 = scan.nextDouble();

        System.out.println("Digite seu terceiro valor");
        double valor3 = scan.nextDouble();

        double soma = valor1 + valor2 + valor3;

        if(soma % 5 == 0 ){
            System.out.println("A soma dos três valores é divisivél por 5");
        } else {
            System.out.println("A soma dos três não é divisivél por 5");
        }
        scan.close();
    }
}
