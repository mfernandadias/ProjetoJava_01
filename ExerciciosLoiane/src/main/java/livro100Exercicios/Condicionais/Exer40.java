package livro100Exercicios.Condicionais;
import java.util.Scanner;

public class Exer40 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /* Faça um programa que leia três notas de um plano e informe se ele foi aprovado
        (nota final maior ou igual a 7), reprovado (nota final menor que 4) ou ficou de recuperação
        (nota final entre 4 e 7)
         */

        System.out.println("Você irá informar as três notas ");

        System.out.println("Prova 01: ");
        double prova01 = scan.nextDouble();

        System.out.println("Prova 02");
        double prova02 = scan.nextDouble();

        System.out.println("Prova03");
        double prova03 = scan.nextDouble();

        System.out.println("Prova 01: " + prova01);
        if(prova01 >= 7.0){
            System.out.println("Parabéns, você foi aprovado");
        } else if(prova01 > 4.0 && prova01 < 7.0){
            System.out.println("Você necessita realizar a recuperação");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println("Prova 02: " + prova02);
        if(prova02 >= 7.0){
            System.out.println("Parabéns, você foi aprovado");
        } else if(prova02 >= 4.0 && prova02 < 7.0){
            System.out.println("Você necessita realizar a recuperação");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println("Prova 03: " + prova03);
        if(prova03 >= 7.0){
            System.out.println("Parabéns, você foi aprovado");
        } else if(prova03 > 4.0 && prova03 < 7.0){
            System.out.println("Você necessita realizar a recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
