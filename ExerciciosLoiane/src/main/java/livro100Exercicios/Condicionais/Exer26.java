package livro100Exercicios.Condicionais;
import  java.util.Scanner;

public class Exer26 {
    public static void main(String[] args){
        /*
        faça um programa que solicite a isade de uma pessoa e exiba se ela é maior ou não
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = scan.nextInt();

        if(idade >= 18){
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }
    }
}
