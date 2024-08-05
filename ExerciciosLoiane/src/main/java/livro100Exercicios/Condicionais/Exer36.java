package livro100Exercicios.Condicionais;
import java.util.Scanner;
/*
Faça um programa que leia a idade de três pessoas e quantas delas é maior de idade
(idade maior ou igual a 18)
 */

public class Exer36 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a idade de três pessoas");
        System.out.println("Primeira pessoa: ");
        double idade1 = scan.nextDouble();

        System.out.println("Segunda pessoa: ");
        double idade2 = scan.nextDouble();

        System.out.println("Digite a terceira idade: ");
        double idade3 = scan.nextDouble();

        int contadorMaioresIdade = 0;

        if(idade1 >= 18){
            contadorMaioresIdade++;
        } else if(idade2 >= 18){
            contadorMaioresIdade++;
        } else {
            contadorMaioresIdade++;
        }

        System.out.println("Quantidade de maiores de idade: " + contadorMaioresIdade);

        scan.close();

    }
}
