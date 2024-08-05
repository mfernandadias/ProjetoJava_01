package livro100Exercicios.Condicionais;
import java.util.Scanner;

public class Exerc32 {
    public static void main(String[] args){
        /*
        faça um programa que leia as notas de duas provas, calcule a média aritmédica simples, e informe
        se o aluno foir aprovado (média maior ou igual a 6) ou reporvado (média menor 6)
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        double nota1 = scan.nextDouble();

        System.out.println("Digite o segundo nota");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("Sua média é: " + media);

        if(media >= 6.0){
            System.out.println("Parabéns, você foi aprovado");
        } else{
            System.out.println("Infelizmente você foi reprovado");
        }
    }
}
