package livro100Exercicios.Condicionais;
import java.util.Scanner;

public class Exer34 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /*
        Crie um programa que leia três números e verifique se a soma deles é
        posistivo, negativo ou igual a zero
         */
        System.out.println("Digite seu primeiro valor");
        double valor1 = scan.nextDouble();

        System.out.println("Digite seu segundo valor");
        double valor2 = scan.nextDouble();

        System.out.println("Digite seu terceiro valor");
        double valor3 = scan.nextDouble();

        double soma = valor1 + valor2 + valor3;
        System.out.println("A soma dos três valores são: " + soma);

        if(soma > 0){
            System.out.println("Sua soma é positiva");
        } else if(soma < 0){
            System.out.println("Sua soma é negativo");
        } else {
            System.out.println("Sua soma é igual a zero");
        }
    }
}
