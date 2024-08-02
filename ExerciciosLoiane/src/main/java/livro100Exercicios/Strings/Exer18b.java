package livro100Exercicios.Strings;
import java.util.Scanner;
/*
crie um programa que receba uma frase e substitua todas as letras "a" por "e"
 */
public class Exer18b {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //utilizando laço de repetição

        System.out.println("Digite uam frase:");
        String frase = scan.nextLine();

        String novaFrase = "";

        for (int i = 0; i < frase.length(); i++){
            char letra = frase.charAt(i);

            if(letra == 'a'){
                novaFrase += 'e';
            } else {
                novaFrase += letra;
            }
        }
        System.out.println("Frase modificada: " + novaFrase);

        scan.close();
    }
}
