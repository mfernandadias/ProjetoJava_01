package livro100Exercicios.matematica;
import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double numa = scan.nextDouble();

        System.out.println("Digite o valor b: ");
        double numb = scan.nextDouble();

        System.out.println("Digite o valor c: ");
        double numc = scan.nextDouble();

        double delta = Math.pow(numb, 2) - (4 * numa * numc);

        System.out.println("O delta para a equação é: " + delta);

        scan.close();
    }
}
