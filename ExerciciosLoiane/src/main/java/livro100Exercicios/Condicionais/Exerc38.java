package livro100Exercicios.Condicionais;
import java.util.Scanner;

public class Exerc38 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /*
        faça um programa que leia o ano de nascimento de uma pessoa e informe se ela está apta a votar (idade
        maior ou igual a 16 anos).
         */

        System.out.println("Informei o ano do seu nascimento");
        int anoDeNascimento = scan.nextInt();

        int anoAtual = java.time.Year.now().getValue();
        int idade = anoDeNascimento = anoAtual;

        if (idade >= 16){
            System.out.println("Você tem liberação para votar");
        } else {
            System.out.println("Atualmente hoje não tem liberação para votar");
        }

    }
}
