package livro100Exercicios.matematica;
import java.util.Scanner;
/*
Escreva um porgama que calcule o trabalo realizado por uma força que atua sobre um objeto,
utilizando a fórmula T = F * d, onde T é o trabalho, F é o força aplicada e d é a distãncida percorrida pelo objeto
 */

public class Exer13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do Trabalho(T): ");
        double trabalho = scan.nextDouble();

        System.out.println("Digite o valor da distancia(d): ");
        double distancia = scan.nextDouble();

        double forcaAplicada = trabalho * distancia;

        System.out.println("A força aplicadata é: " + forcaAplicada);


    }
}
