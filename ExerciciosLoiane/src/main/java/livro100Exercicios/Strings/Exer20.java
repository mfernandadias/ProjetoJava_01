package livro100Exercicios.Strings;
/*
faça um programa que leia uma palavra e verifique se a mesma é palindromo (se pode ser lida da mesma forma
de tràs para frente)
 */
import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palvra");
        String palavra = scan.nextLine();

        //removemos os espeços em brando e convertemos para letra minúsucllas
        String palavraFormatada = palavra.replaceAll("\\s+", "").toLowerCase();
        boolean palindromo = true;

        //percorremos a palavra verificando se os caracteres coincidemm
        for (int i = 0; i < palavraFormatada.length() / 2; i++){
            char a = palavraFormatada.charAt(i);
            char b = palavraFormatada.charAt(palavraFormatada.length() - i - 1);
            if(a != b){
                palindromo = false;
                break;
            }
        }
        if(palindromo){
            System.out.println("A palavra é um palíndromo");
        } else {
            System.out.println("A palavra não é um palíndromo");
        }
        scan.close();
    }
}
