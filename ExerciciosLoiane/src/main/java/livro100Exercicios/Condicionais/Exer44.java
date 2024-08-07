package livro100Exercicios.Condicionais;
import java.util.Scanner;

public class Exer44 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /*
      crie um programa que solicite a idade de uma pessoa e exiba se ela é criança ( 0 - 12 idade),
      adolescente (13 - 17 anos), adulto (18 - 59 anos) ou idoso(60 anos ou mais)
         */

        System.out.println("Digite sua idade");
        int idade = scan.nextInt();

        if (idade > 0 && idade < 12){
            System.out.println("Você é considerado criança");
        } else if(idade > 13 && idade < 17){
            System.out.println("Você é consideraado adolescente");
        } else if(idade > 18 && idade < 59){
            System.out.println("Você é considerdo adulto");
        } else {
            System.out.println("Você é idoso");
        }
    }
}
