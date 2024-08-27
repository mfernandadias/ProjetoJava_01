package livro100Exercicios.matrizes;
import java.util.Scanner;
public class Exer84 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        /*
        faça um programa que preencha uma matriiz 5x5 com números inteiros exiba o maior valor da matriz e a posição
        em que ele se encontra
         */
        int[][] matriz = new int[5][5];

        int maiorValor = Integer.MIN_VALUE;
        int linhaMaiorValor = 0;
        int colunaMaiorValor = 0;

        //preenchendo a matriz
        System.out.println("Digite os valores da matriz ");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matriz[i][i] = scan.nextInt();

                //verificando se o valor é maior que o maiorValor atual
                if(matriz[i][j] > maiorValor){
                    maiorValor = matriz[i][j];
                    linhaMaiorValor = i;
                    colunaMaiorValor = j;
                }
            }
        }

        //exibindo o maior valor e a posição
        System.out.println("O maior valor da matriz é: " + maiorValor);
        System.out.println("Ele está na posição: ["+linhaMaiorValor+"]["+colunaMaiorValor+"]");

        scan.close();


    }
}
