package Aula17;
import java.util.Scanner;

/*
faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se a média
de idade da turma veria entre 0 e 25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta u idos, conforme
a média calculada
 */

public class Exerc25 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double soma = 0.0;

        System.out.println("Digite o número de pessoas que há na sala: ");
        int N = scan.nextInt();

        for (int i = 1; i <= N; i++){
            System.out.println("Digite a idade da " + i+"ª pessoa:");
            int idade = scan.nextInt();
            soma =+ idade;
        }

        double media = soma / N;

        if (media > 0 && media < 26){
            System.out.println("A turma pe majoritariamente jovem");
        } else if  (media >= 26 && media < 60){
            System.out.println("A turma é majoritariamente adulta");
        } else {
            System.out.println("A turma é majoritariamente idosa");
        }

        scan.close();
    }
}
