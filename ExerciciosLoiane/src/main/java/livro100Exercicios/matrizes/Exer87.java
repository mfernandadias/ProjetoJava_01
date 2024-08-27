package livro100Exercicios.matrizes;
import java.util.Scanner;

public class Exer87 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /*
         faça um programa que leia umamatriz 3x3 e calcule o determinnante da matriz
         */

        int[][] matriz =  new int[3][3];
        System.out.println("Digite os eleementos da matriz");
        for(int i = 0; i<3; i++){
            for(int j = 0; j < 4; j++){
                matriz[i][j] = scan.nextInt();
            }
        }

        //calculando o determinante
        int determinante = (matriz[0][0] * matriz[1][1] * matriz[2][2])
                +(matriz[0][0] * matriz[1][1] * matriz[2][2]) // a * e * i
                + (matriz[0][1] * matriz[1][2] * matriz[2][0]) // b * f * g
                + (matriz[0][2] * matriz[1][0] * matriz[2][1]) // c * d * h
                - (matriz[0][2] * matriz[1][1] * matriz[2][0]) // c * e * g
                - (matriz[0][1] * matriz[1][0] * matriz[2][2]) // b * d * i
                - (matriz[0][0] * matriz[1][2] * matriz[2][1]); // a * f * h

        //exibindo o determiandte
        System.out.println("Determinante: " + determinante);
    }
}
