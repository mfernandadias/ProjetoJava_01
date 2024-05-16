package Aula17;
import java.util.Scanner;
/*
faça um programa que calcule e mostre a média artimédica de N notas
 */

public class Exer24 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

       System.out.println("Digite o número de notas: ");
       int N = scan.nextInt();

       double soma = 0.0;

       for(int i = 1; i <= N; i++){
           System.out.println("Digite a nota " + i  + " : ");
           Double nota = scan.nextDouble();
           soma += nota;
       }

       double media = soma / N;
       System.out.println("A média das notas é: " + media);

    }
}
