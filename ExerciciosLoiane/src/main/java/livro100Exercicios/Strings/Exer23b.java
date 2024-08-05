package livro100Exercicios.Strings;
import java.util.Scanner;
/*
faça um programa que receba uma frase e exiba a quantidade de espaços em branco presentes
na mesma
 */

public class Exer23b {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase ");
        String frase = scan.nextLine();

        //divide a frase em partes separadas pelos espaços em branco
        String[] partes = frase.split(" ");

        //calcule a quantidade de espaços em branco
        int quantidadeEspacos = partes.length - 1;

        System.out.println("Quantidade de espacos em branco: " + quantidadeEspacos);

        scan.close();
    }
}
