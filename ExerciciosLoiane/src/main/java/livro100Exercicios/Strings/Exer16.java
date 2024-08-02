package livro100Exercicios.Strings;
import java.util.Scanner;
/*
crie um programa que leia duas palavras e ao concatena, exibindo a palavra resultado
 */

public class Exer16 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite a primeira palavra: ");
        String palavra1 = scan.nextLine();

        System.out.println("Digite a segunda palavra: ");
        String palavra2 = scan.nextLine();

        String resultado = palavra1 + palavra2;

        System.out.println("A palavra rsultado da concatenação é: " + resultado);

        scan.close();
    }
}
