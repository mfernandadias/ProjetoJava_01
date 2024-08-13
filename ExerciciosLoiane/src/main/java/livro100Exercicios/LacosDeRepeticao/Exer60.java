package livro100Exercicios.LacosDeRepeticao;
import java.util.Scanner;

public class Exer60 {
    /*
    escreva um programa que leia números do usuário até que
    seja digitado um número negativo, e exiba a soma dos números positivos
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numero;
        int soma = 0;

        do{
            System.out.println("Digite um número (negativo para sair): ");
            numero = scan.nextInt();

            if(numero > 0){
                soma += numero;
            }
        }while (numero >= 0);
        System.out.println("A soma dos números postivos é: " + soma);
        scan.close();
    }
}
