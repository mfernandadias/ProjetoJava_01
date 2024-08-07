package livro100Exercicios.LacosDeRepeticao;
import java.util.Scanner;

public class Exer52 {
    public static void main(String[] args){
        /*
        Escreva um program que solicite ao usuário um número N e exiba a soma de todos os números de 1 a N
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int num = scan.nextInt();

        int resultado = 0;
        for(int j = 1; j <= num; j++){
            resultado += j;
            System.out.println("Resultado: " + j);
        }

        /*
         for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = ");
            }
         */


    }
}
