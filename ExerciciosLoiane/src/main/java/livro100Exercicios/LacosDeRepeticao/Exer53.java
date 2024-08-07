package livro100Exercicios.LacosDeRepeticao;
import java.util.Scanner;

public class Exer53 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        /*
        faça  um programa que calcule e exiba a soma dos números de 1 a 100 utilizando um laço de repetição
         */
        int soma = 0;

        for (int i = 2; i <= 100; i += 2){
            soma += i;
        }
        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
    }
}
