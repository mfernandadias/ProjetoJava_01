package livro100Exercicios.Condicionais;
import java.util.Scanner;

public class Exerc39 {
    public static void main(String[] args){
        /*
        Faça um programa que leia a idade de uma pessoa e informe se ela não esta apta
        (idade inferior a 16 anos), se está apta a votar, porém não é obrigatorio (16, 17 anos
        ou idade igual ou superior a 70 anos), ou se é obrigatorio ( 18 a 69)
         */

        Scanner scan = new Scanner (System.in);

        System.out.println("Digite seu ano de nascimento");
        int anoDeNascimento = scan.nextInt();


        int anoAtual = java.time.Year.now().getValue();
        int idade = anoAtual - anoDeNascimento;

        if(idade == 16 || idade == 17){
            System.out.println("Você esta apto para realizar a votação, mas não é obrigatori");
        } else if (idade >= 70){
            System.out.println("Você esta apto para realizar a votação, mas não é obrigatori");
        } else if(idade >= 18){
            System.out.println("Você esta apto para realizar a votação");
        } else {
            System.out.println("Você é menor de 16 anos e não esta apto para votar");
        }

    }
}
