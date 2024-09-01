package livro100Exercicios.matrizes;
import java.util.Scanner;

public class Exer90 {
    /*
    faça um programa que leia uma matriz m xn, indicando o local onde já minas de um
    jogo de campo minado (sendo
    0 para campo neutro, e 1 para locais onde haveriam minas), e o programa deveria retornar
    uma matriz indicando, para
    cada posição, o número de minas nas casas vizinhas
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //leitura das dimensões da matriz
        System.out.println("Digite o número de linhas da matriz");
        int linhas = scan.nextInt();
        System.out.println("Digite o número de colunas da matriz");
        int colunas = scan.nextInt();

        //criação da matriz
        int[][] campoMinado = new int[linhas][colunas];

        //leitura da matriz
        System.out.println("Digite a matriz indicando os locais das minas");
        System.out.println("0 para campo neutro e 1 para mina");

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                campoMinado[i][j] = scan.nextInt();
            }
        }

        //criação damatriz com a contagem da minas nas casas vizinhas

        //iteração pela matriz campoMinado
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                //verifique se a posição contém uma mina
                if(campoMinado[i][j] == 1){
                    //incrementado o número de minas nas casas vizinhas
                    incrementarVizinhos(resultado, i, j);
                }
            }
        }

        //exibindo da matriz resultado
        System.out.println("Matriz com a contagem de minas nas casas vizinhas: ");
        for(int i = 0; i < colunas; i++ ){
            for(int j = 0; j < colunas; j++){
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
        scan.close();
    }

    //método para incrementar o número de minas nas casa vizinhas
    public static void incrementarVizinhos(int[][] matriz,int linha,int coluna){
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        //verificando dos vizinhos em torno da posição atual
        for(int i = linha -1; i <= linhas +1; i++){
            for(int j = coluna - 1; j <= coluna + 1; j++){
                //verifica sea posição é válida e não é a posição atual
                if(i >= 0 && i < linhas && j >= 0 &&
                j < colunas && !(i == linha && j == coluna)){
                    matriz[i][j]++;
                }
            }
        }
    }

}
