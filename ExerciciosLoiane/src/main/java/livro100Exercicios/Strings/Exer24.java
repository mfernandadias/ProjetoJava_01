package livro100Exercicios.Strings;
import java.util.Scanner;
/*
crie um programa que leia uma palavra e exiba a quantidade de vogais presentes na mesma
 */

public class Exer24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String palavra = scan.nextLine();

        int contadorVogais = 0;

        //percorre cara caratere da palavra
        for (int i = 0; i < palavra.length(); i++) {
            char letra = Character.toLowerCase(palavra.charAt(i));

            //verifique se a letra é uma vogal
            if (letra == 'a' ||
                    letra == 'e' ||
                    letra == 'i' ||
                    letra == 'o' ||
                    letra == 'u' ){
                contadorVogais++;
            }
        }
        System.out.println("Quantidade de vogais: " + contadorVogais);
        scan.close();
    }
}
