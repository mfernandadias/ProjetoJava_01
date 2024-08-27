package livro100Exercicios.matrizes;
import java.util.Scanner;

public class Exer85 {
    /* faça um programa que leia uma matriz 3x3 e calcule amédia dos valores presentes nas posições pares (soma dos índices par)
    na matriz

     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int soma = 0;
        int quantidade = 0;

        //int somaDiagonal = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matriz[i][i] = scan.nextInt();

                //verificando se a posição é par
                if ((i + j) % 2 == 0){
                    soma += matriz[i][j];
                    quantidade++;
                }
            }
        }

        //calculando a média
        double media = (double) soma /quantidade;

        //exibindo a média
        System.out.println("Amédia dos valores presentes nas posições pares é: " + media);

        scan.close();



    }
}
