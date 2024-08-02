package livro100Exercicios.Strings;
import java.util.Scanner;
/*
crie uam programa que receba uma frase e substitua todas as letras "a" por "e"
 */

public class Exerc18 {
    public static void main(String[] args){
        //utilizando replace
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase");
        String frase = scan.nextLine();

        String novaFrase = frase.replace('a', 'e');

        System.out.println("Frase modificada: " + novaFrase);

        scan.close();


    }
}
