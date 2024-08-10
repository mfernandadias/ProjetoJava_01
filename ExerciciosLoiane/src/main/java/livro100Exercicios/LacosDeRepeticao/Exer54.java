package livro100Exercicios.LacosDeRepeticao;
import java.util.Scanner;

public class Exer54 {
    public static void main(String[] args){
        /*
        Escreva um programa que calcule e exiba o valor da potência de um número informado pelo
        usuário elevado a um expoente também informado pelo usuário, utilizando laços de repetição
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número base: ");
        double base = scan.nextDouble();

        System.out.println("Digite o número o expoente: ");
        double expoente = scan.nextDouble();

        int resultado = 1;

        for (int i = 1; i <= expoente; i++){
            resultado += base;
        }

        System.out.println(base + " elevado a " + expoente + " é:" + resultado);

        scan.close();

    }
}
