package livro100Exercicios.matematica;
import java.util.Scanner;

public class Exerc14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /*
        escreva um programa que leia a posição x e y de dois pontos no plano cartesiano,
        e calcule a distância entre ambas
         */

        System.out.println("Digite as coordenadas do primeiro ponto: ");
        System.out.println("Coordenada x: ");
        double x1 = scan.nextDouble();
        System.out.println("Coordenanda y: ");
        double y1 = scan.nextDouble();

        System.out.println("Digite as coordenadas o segundo  ponto: ");
        System.out.println("Coordenanda x: ");
        double x2 = scan.nextDouble();
        System.out.println("Coordenada y: ");
        double y2 = scan.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("\nA distância entre os pontos é: " + distancia);

        scan.close();


    }
}
