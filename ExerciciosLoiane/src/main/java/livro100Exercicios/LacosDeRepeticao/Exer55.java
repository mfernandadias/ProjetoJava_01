package livro100Exercicios.LacosDeRepeticao;
import java.util.Scanner;
public class Exer55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        escreva um programa que solicite ao usuário um número N e diga se o mesmo é primo ou não
         */
        System.out.println("Digite um número inteiro: ");
        int num = scan.nextInt();

        System.out.println("Números primos menores que " + num  + ": ");

        for (int i = 2; i < num; i++){
            boolean isPrimo = true;
            for(int j = 2; j < i; j++){
                if(j % 2 == 0){
                    isPrimo = false;
                    break;
                }
            }
            if(isPrimo){
                System.out.println(i + " ");
            }
        }

        /*for (int i = 2; i < num; i++) {
            boolean isPrimo = true;

            for (int j = 2; j < i; j++) {
                if( i % j == 0){
                isPrimo = false;
                    break;
                }
            }
            if (isPrimo) {
                System.out.println(i + " ");
            }
        }*/
    }
}
