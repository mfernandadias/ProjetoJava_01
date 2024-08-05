package livro100Exercicios.Condicionais;
import java.util.Scanner;

public class Exer27 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /*
        Faça um programa que leia dois números e informe qual é o maior
         */
        System.out.println("Digite o primeiro valor");
        Double valor1 = scan.nextDouble();

        System.out.println("Digite o segundo valor");
        Double valor2 = scan.nextDouble();

        if(valor1 > valor2){
            System.out.println("O primeiro valor é maior que o segundo valor ");
        } else if  (valor2 > valor1){
            System.out.println("O segundo valor é maior que primeiro");
        } else {
            System.out.println("OS dois valores são iguais");
        }

    }
}
