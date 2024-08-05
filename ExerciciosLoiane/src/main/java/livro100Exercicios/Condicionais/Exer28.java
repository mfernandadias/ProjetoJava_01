package livro100Exercicios.Condicionais;
import java.util.Scanner;

public class Exer28 {
    public static void main(String[] args){
        /*
        Escreva um programa que solicite três números e exiba o maior deles
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu primeiro valor");
        double valor1 = scan.nextDouble();

        System.out.println("Digite seu segundo valor");
        double valor2 = scan.nextDouble();

        System.out.println("Digite seu terceiro valor");
        double valor3 = scan.nextDouble();

        if (valor1 > valor2 && valor1 > valor3){
            System.out.println("O primeiro valor é maior que os valores um e dois");
        } else if(valor2 > valor1 && valor2 > valor3){
            System.out.println("O segundo valor é maior que valores um e três");
        } else {
            System.out.println("O valor três é maior que os valores um e dois ");
        }

    }
}
