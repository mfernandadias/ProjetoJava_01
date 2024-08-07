package livro100Exercicios.Condicionais;
import java.util.Scanner;

public class Exer43 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /*
        escreva um programa que solicite um número inteiro e verifique se é sivisível por 3
        e por 5 ao mesmo tempo
         */
        System.out.println("Digite um número interio");
        int valor = scan.nextInt();

        if(valor % 3 == 0 && valor % 5 == 0 ){
            System.out.println("O valor digitado é divisivel por 3 e 5 ");
        } else {
            System.out.println("O valor não é divisivel por 3 e 5 ");
        }
    }
}
