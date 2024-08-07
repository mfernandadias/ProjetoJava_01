package livro100Exercicios.Condicionais;
import java.util.Scanner;

public class Exer42 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        /*
        escreva um programa que solicite a altura e o peso de uma pessoa e calcule o seu índice de massa corporal (IMC),
        exibindo a categoria correspondente (abaixo do peso normal, sobrepeso, obesidade grave)
         */
        System.out.println("Digite o peso (em kg): ");
        double peso = scan.nextDouble();

        System.out.println("Digite a altura (em metro): ");
        double altura = scan.nextDouble();

        double imc = peso / (altura * altura);
        String categoria;

        if(imc < 18.5){
            categoria = "Abaixo do peso";
        } else if( imc < 25){
            categoria = "Peso normal";
        } else if( imc < 30){
            categoria = "Sobrepeso";
        } else if(imc < 35){
            categoria = "Obesidade";
        } else {
            categoria = "Obesidade grave";
        }

        System.out.println("Sei IMC é: " + imc);
        System.out.println("Categoria: " + categoria);
        scan.close();



    }
}
