package livro100Exercicios.Strings;
import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
            /*
            escreva um programa que receba um nome e verifique se o mesmo começa coma letra "A"
             */
        System.out.println("Digite um nome: ");
        String nome = scan.nextLine();

        //convertemos o nome para a letra minuscula
        String nomeMinusculo = nome.toLowerCase();

        if(nomeMinusculo.startsWith("a")){
            System.out.println("O nome com a letra A.");
        } else {
            System.out.println("O nome não começa com a letra A.");
        }
        scan.close();
    }
}
