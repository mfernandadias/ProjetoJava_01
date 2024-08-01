package livro100Exercicios.matematica;
import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do circulo é: " + area);

        scan.close();
    }
}
